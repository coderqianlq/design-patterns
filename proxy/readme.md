## 代理模式

近年来，代购已逐步成为电子商务的一个重要分支。代购简单来说就是找人帮忙购买所需要的商品，代购网站就是其中一种产物，它为消费者提供在线的代购服务，如果看中某国外购物网站上的商品，可以登录代购网站填写代购单并付款，代购网站会帮助进行购买然后通过快递公司将商品发送给消费者。商品代购过程如图所示：<br/>
![](src/main/resources/image/商品代购过程图.png)

在软件开发中，也有一种设计模式可以提供与代购网站类似的功能。由于某些原因，客户端不想或不能直接访问一个对象，此时可以通过一个称之为“代理”的第三者来实现间接访问，该方案对应的设计模式被称为代理模式。

### 模式概述

定义：给某一个对象提供一个代理或占位符，并由代理对象来控制对原对象的访问。

代理模式是一种对象结构型模式。在代理模式中引入了一个新的代理对象，代理对象在客户端对象和目标对象之间起到中介的作用，它去掉客户不能看到的内容和服务或者增添客户需要的额外的新服务。

代理模式的结构比较简单，其核心是代理类，为了让客户端能够一致性地对待真实对象和代理对象，在代理模式中引入了抽象层，代理模式结构如图所示：<br/>
![](src/main/resources/image/代理模式结构图.gif)

* Subject（抽象主题角色）：它声明真实主题和代理主题的共同接口，使得在任何使用真实主题的地方都可以使用代理主题，客户端通常需要针对抽象主题角色进行编程。
* Proxy（代理主题角色）：它包含对真实主题的引用，从而可以在任何时候操作真实主题对象；在代理主题角色中提供一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题；代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束。通常，在代理主题角色中，客户端在调用所引用的真实主题操作之前或之后还需要执行其他操作，而不仅仅是单纯调用真实主题对象中的操作。
* RealSubject（真实主题角色）：它定义代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，客户端可以通过代理主题角色间接调用真实主题角色中定义的操作。

### 模式实现

代理模式的结构图比较简单，但是在真实的使用和实现过程中要复杂很多，特别是代理类的设计和实现。

抽象主题类声明真实主题类和代理类的公共方法，它可以是接口、抽象类或具体类，客户端针对抽象主题类编程，一致性地对待真实主题和代理主题，典型的抽象主题类代码如下：
```java
public interface Subject {
    void request();
}

```

真实主题类继承抽象主题类，提供业务方法的具体实现，其典型代码如下：

```java
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request");
    }
}
```

代理类也是抽象主题类的子类，它维持一个对真实主题对象的引用，调用在真实主题中实现的业务方法，在调用时可以在原有业务方法的基础上附加一些新的方法来对功能进行扩充或约束，最简单的代理类实现代码如下：
```java
public class ProxySubject implements Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("preRequest");
    }

    private void postRequest() {
        System.out.println("postRequest");
    }
}
```

在实际开发过程中，代理类的实现比上述代码要复杂很多，代理模式根据其目的和实现方式不同可分为很多种类，其中常用的几种代理模式简要说明如下：<br/>
(1) 远程代理(Remote Proxy)：为一个位于不同的地址空间的对象提供一个本地的代理对象，这个不同的地址空间可以是在同一台主机中，也可是在另一台主机中，远程代理又称为大使(Ambassador)。<br/>
(2) 虚拟代理(Virtual Proxy)：如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，真实对象只在需要时才会被真正创建。<br/>
(3) 保护代理(Protect Proxy)：控制对一个对象的访问，可以给不同的用户提供不同级别的使用权限。<br/>
(4) 缓冲代理(Cache Proxy)：为某一个目标操作的结果提供临时的存储空间，以便多个客户端可以共享这些结果。<br/>
(5) 智能引用代理(Smart Reference Proxy)：当一个对象被引用时，提供一些额外的操作，例如将对象被调用的次数记录下来等。

### Java两种动态代理方式

#### JDK自带的动态代理
* java.lang.reflect.Proxy：生成动态代理类和对象；
* java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现。

典型代码如下：
```java
public class JdkProxy implements InvocationHandler {

    private Subject realSubject;

    public Subject newProxy(Subject realSubject) {
        // 将目标对象传入进行代理
        this.realSubject = realSubject;
        // 返回代理对象
        return (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        Object obj;
        if ("request".equals(method.getName())) {
            obj = method.invoke(realSubject, args);
            System.out.println("调用request方法");
        } else {
            obj = method.invoke(realSubject, args);
            System.out.println("调用其它方法");
        }
        return obj;
    }
}
```

#### Cglib动态代理

Cglib动态代理是针对代理的类，动态生成一个子类，然后子类覆盖代理类中的方法，如果是private或是final类修饰的方法，则不会被重写。

典型代码如下：
```java
public class CglibProxy implements MethodInterceptor {

    // CGlib需要代理的目标对象
    private Subject realSubject;

    public Object createProxyObject(Subject subject) {
        this.realSubject = subject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(subject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用代理类");
        Object obj;
        if ("request".equals(method.getName())) {
            obj = method.invoke(realSubject, args);
            System.out.println("调用request方法");
        } else {
            obj = method.invoke(realSubject, args);
            System.out.println("调用其它方法");
        }
        return obj;
    }
}
```

### 模式总结

代理模式为对象的间接访问提供了一个解决方案，可以对对象的访问进行控制。代理模式类型较多，其中远程代理、虚拟代理、保护代理等在软件开发中应用非常广泛。

1.主要优点<br/>
(1) 能够协调调用者和被调用者，在一定程度上降低系统的耦合度。<br/>
(2) 客户端可以针对抽象主题角色进行编程，增加和更换代理类无须修改源代码，符合开闭原则，系统具有较好的灵活性和可扩展性。

2.主要缺点<br/>
(1) 由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢，例如保护代理。<br/>
(2) 实现代理模式需要额外的工作，而且有些代理模式的实现过程较为复杂，例如远程代理。

3.适用场景<br/>
(1) 当客户端对象需要访问远程主机中的对象时可以使用远程代理。<br/>
(2) 当需要用一个消耗资源较少的对象来代表一个消耗资源较多的对象，从而降低系统开销、缩短运行时间时可以使用虚拟代理，例如一个对象需要很长时间才能完成加载时。<br/>
(3) 当需要为某一个被频繁访问的操作结果提供一个临时存储空间，以供多个客户端共享访问这些结果时可以使用缓冲代理。通过使用缓冲代理，系统无须在客户端每一次访问时都重新执行操作，只需直接从临时缓冲区获取操作结果即可。<br/>
(4) 当需要控制对一个对象的访问，为不同用户提供不同级别的访问权限时可以使用保护代理。<br/>
(5) 当需要为一个对象的访问（引用）提供一些额外的操作时可以使用智能引用代理。

### 参考链接
[代理模式-Proxy Pattern](https://gof.quanke.name/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F-Proxy%20Pattern.html)




