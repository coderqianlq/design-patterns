## 模板方法模式

在现实生活中，很多事情都包含几个实现步骤，例如请客吃饭，无论吃什么，一般都包含点单、吃东西、买单等几个步骤，通常情况下这几个步骤的次序是：点单 --> 吃东西 --> 买单。在这三个步骤中，点单和买单大同小异，最大的区别在于第二步——吃什么？

### 模式概述

定义：定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

模板方法模式是结构最简单的行为型设计模式，在其结构中只存在父类与子类之间的继承关系。通过使用模板方法模式，可以将一些复杂流程的实现步骤封装在一系列基本方法中，在抽象父类中提供一个称之为模板方法的方法来定义这些基本方法的执行次序，而通过其子类来覆盖某些步骤，从而使得相同的算法框架可以有不同的执行结果。模板方法模式提供了一个模板方法来定义算法框架，而某些具体步骤的实现可以在其子类中完成。

模板方法模式结构比较简单，其核心是抽象类和其中的模板方法的设计，其结构如图所示：
<div align=center><img src="https://img.hacpai.com/file/2019/11/image-1253f33e.png"  alt="模板方法模式结构图"></div>

1. AbstractClass（抽象类）：在抽象类中定义一系列基本操作，这些基本操作可以是具体的，也可以是抽象的，每一个基本操作对应算法的一个步骤，在其子类中可以重定义或实现这些步骤。同时，在抽象类中实现了一个模板方法(Template Method)，用于定义一个算法的框架，模板方法不仅可以调用在抽象类中实现的基本方法，也可以调用在抽象类的子类中实现的基本方法，还可以调用其他对象中的方法。
2. ConcreteClass（具体子类）：它是抽象类的子类，用于实现在父类中声明的抽象基本操作以完成子类特定算法的步骤，也可以覆盖在父类中已经实现的具体基本操作。

### 模式实现

在模板方法模式中，抽象类的典型代码如下：

```java
public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    final void templateMethod() {
        doFirst();
        doSecond();
        doThird();
        doFouth();
    }

    /**
     * 具体方法
     */
    void doFirst() {
        System.out.println("start do something.");
    }

    /**
     * 抽象方法，延迟到子类
     */
    abstract void doSecond();

    /**
     * 抽象方法，延迟到子类
     */
    abstract void doThird();

    /**
     * 具体方法
     */
    void doFouth() {
        System.out.println("finish!");
    }
}
```

在抽象类中，模板方法templateMethod()定义了算法的框架，在模板方法中调用基本方法以实现完整的算法，每一个基本方法如doFirst()、doFouth()等均实现了算法的一部分，对于所有子类都相同的基本方法可在父类提供具体实现，否则在父类声明为抽象方法，由不同的子类提供不同的实现，例如doSecond()和doThird()。

在抽象类的子类中提供抽象步骤的实现，也可覆盖父类中已经实现的具体方法，具体子类的典型代码如下：

```java
public class ConcreteDoA extends AbstractTemplate {

    @Override
    void doSecond() {
    }

    @Override
    void doThird() {
    }
}

public class ConcreteDoB extends AbstractTemplate {

    @Override
    void doSecond() {
    }

    @Override
    void doThird() {
    }

    @Override
    void doFouth() {
    }
}
```

客户端代码如下：

```java
public class TemplateMethodPatternDemo {

    public static void main(String[] args) {
        AbstractTemplate doB = new ConcreteDoB();
        doB.templateMethod();
    }
}
```

有关JDBCTemplate如何运用模板方法模式的原理和简单实现可参考我的Github：[JDBCTemplate](https://github.com/coderqianlq/design-patterns/tree/master/template-method/src/main/java/com/qianlq/templatemethod/example)

### 模式总结

模板方法模式是基于继承的代码复用技术，它体现了面向对象的诸多重要思想，是一种使用较为频繁的模式。模板方法模式广泛应用于框架设计中，以确保通过父类来控制处理流程的逻辑顺序（如框架的初始化，测试流程的设置等）。

**主要优点**
1. 在父类中形式化地定义一个算法，而由它的子类来实现细节的处理，在子类实现详细的处理算法时并不会改变算法中步骤的执行次序。
2. 模板方法模式是一种代码复用技术，，它提取了类库中的公共行为，将公共行为放在父类中，而通过其子类来实现不同的行为。

**主要缺点**
1. 需要为每一个基本方法的不同实现提供一个子类，如果父类中可变的基本方法太多，将会导致类的个数增加，系统更加庞大，设计也更加抽象。参考链接的原文作者提出可结合桥接模式来进行设计，具体如何设计可以开动我们的大脑。

**适用场景**
1. 对一些复杂的算法进行分割，将其算法中固定不变的部分设计为模板方法和父类具体方法，而一些可以改变的细节由其子类来实现。
2. 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
3. 需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制。

### 参考链接

[模板方法模式-Template Method Pattern](https://gof.quanke.name/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F-Template%20Method%20Pattern.html)
