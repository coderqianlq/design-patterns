## 原型模式

在软件系统中，一个对象的状态或行为的变化将导致其他对象的状态或行为也发生改变，它们之间将产生联动。为了更好地描述对象之间存在的这种一对多（包括一对一）的联动，观察者模式应运而生，它定义了对象之间一种一对多的依赖关系，让一个对象的改变能够影响其他对象。

### 模式概述

定义：定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。

观察者模式结构中通常包括观察目标和观察者两个继承层次结构，其结构如图所示：<br/>
![](src/main/resources/image/观察者模式结构图.gif)

* Subject（目标）：目标是指被观察的对象，可以使接口、抽象类或者具体类。在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。
* ConcreteSubject（具体目标）：具体目标是目标类的子类，通常它包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知；同时它还还可以实现目标类中定义的抽象方法。如果无须扩展目标类，则具体目标类可以省略。
* Observer（观察者）：观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法update()。
* ConcreteObserver（具体观察者）：在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；它实现了在抽象观察者Observer中定义的update()方法。通常在实现时，可以调用具体目标类的attach()方法将自己添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。


### 模式实现

上面讲到观察者模式包含观察目标和观察者两类对象，一个目标可以有任意数目的与之相依赖的观察者，一旦观察目标的状态发生改变，所有的观察者都将得到通知。作为对这个通知的响应，每个观察者都将监视观察目标的状态以使其状态与目标状态同步，这种交互也称为发布-订阅(Publish/Subscribe)。观察目标是通知的发布者，它发出通知时并不需要知道谁是它的观察者，可以有任意数目的观察者订阅它并接收通知。

首先，我们定义一个抽象目标Subject，典型代码如下：

```java
public abstract class Subject {

    /**
     * 定义一个观察者集合用于存储所有观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册方法，用于向观察者集合中添加观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    /**
     * 注销方法，用于在观察者集合中移除观察者
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 声明抽象通知方法
     */
    public abstract void notifyAllObservers();
}
```

具体目标类实现抽象目标类的抽象方法，代码如下：

```java
public class ConcreteSubject extends Subject {

    @Override
    public void notifyAllObservers() {
        // 遍历观察者并进行通知
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
```

观察者角色可以是接口或者抽象类，通常只声明一个update()方法，为不同观察者的更新（响应）行为定义相同的接口，由其子类即具体观察者实现，执行不同的业务逻辑，其代码如下所示：

```java
public interface Observer {
    void update();
}
```

具体观察者负责实现观察者Observer的update()方法，其典型代码如下：

```java
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        // do something
    }
}
```

在有些更加复杂的情况下，具体观察者类ConcreteObserver的update()方法在执行时需要使用到具体目标类ConcreteSubject中的状态（属性），因此在ConcreteObserver与ConcreteSubject之间有时候还存在关联或依赖关系，此时我们可以在ConcreteObserver中定义一个ConcreteSubject实例，通过该实例获取存储在ConcreteSubject中的状态。代码可以参照如下：

```java
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //this.notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if (subject.getState() != 0) {
            // do something
        } else {
            // do nothing
        }
    }
}
```

### 模式总结

观察者模式是一种使用频率非常高的设计模式，它为实现对象之间的联动提供了一套完整的解决方案，凡是涉及到一对一或者一对多的对象交互场景都可以使用观察者模式。

1.模式优点<br/>
(1)	观察者模式可以实现表示层和数据逻辑层的分离，并通过抽象接口的形式，使得可以有各种各样不同的表示层充当具体观察者角色。<br/>
(2) 观察者模式在观察目标和观察者之间建立一个抽象的耦合。观察目标只需要维持一个抽象观察者的集合，无须了解其具体观察者。由于观察目标和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次。<br/>
(3) 观察者模式满足“开闭原则”的要求，增加新的具体观察者无须修改原有系统代码，在具体观察者与观察目标之间不存在关联关系的情况下，增加新的观察目标也很方便。

2.模式缺点<br/>
如果一个观察目标对象有很多直接和间接观察者，将所有的观察者都通知到会花费很多时间。

3.适用场景<br/>
(1) 一个抽象模型有两个方面，其中一个方面依赖于另一个方面，将这两个方面封装在独立的对象中使它们可以各自独立地改变和复用。<br/>
(2)	一个对象的改变将导致一个或多个其他对象也发生改变，而并不知道具体有多少对象将发生改变，也不知道这些对象是谁。

### 我的思考

观察者模式是否符合“开闭原则”？【从增加具体观察者和增加具体目标类两方面考虑。】

从增加具体观察者方面，只要实现Observer接口的update()方法，然后调用attach方法将自己加入到观察者集合即可。

从增加具体目标类方面，如果与具体观察类之间不存在关联或依赖关系，只要实现自己抽象目标类Subject的notify()方法通知所有观察者，但如果与具体观察类存在关联或依赖关系，则可能需要破坏具体观察类的结构。

### 参考链接

[观察者模式-Observer Pattern](https://gof.quanke.name/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F-Observer%20Pattern.html)
