## 建造者模式
> 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
>
> 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

### 意图
> 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。

### 主要解决
> 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。

### 何时使用
> 1、相同的方法，不同的执行顺序，产生不同的事件结果时。<br>
> 2、多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时。<br>
> 3、产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式非常合适。

### 如何解决
> 将变与不变分离开。

### 关键代码
> 建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。

### 应用实例
> 1、套餐的生成。<br>
> 2、JAVA 中的 StringBuilder。

### 优点
> 1、良好的封装性，使用建造者模式可以使客户端不必知道产品内部组成的细节。<br>
> 2、建造者独立，容易扩展。<br>
> 3、在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到。

### 缺点
> 1、会产生多余的Builder对象以及Director对象，消耗内存。<br>
> 2、对象的构建过程暴露。

### 使用场景
> 1、需要生成的对象具有复杂的内部结构。<br>
> 2、需要生成的对象内部属性本身相互依赖。

### 注意事项
> 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。

### Android源码中的模式实现
> 在Android源码中，我们最常用到的Builder模式就是AlertDialog.Builder， 使用该Builder来构建复杂的AlertDialog对象。简单示例如下：

```java
	//显示基本的AlertDialog  
    private void showDialog(Context context) {  
        AlertDialog.Builder builder = new AlertDialog.Builder(context);  
        builder.setIcon(R.drawable.icon);  
        builder.setTitle("Title");  
        builder.setMessage("Message");  
        builder.setPositiveButton("Button1",  
                new DialogInterface.OnClickListener() {  
                    public void onClick(DialogInterface dialog, int whichButton) {  
                        setTitle("点击了对话框上的Button1");  
                    }  
                });  
        builder.setNeutralButton("Button2",  
                new DialogInterface.OnClickListener() {  
                    public void onClick(DialogInterface dialog, int whichButton) {  
                        setTitle("点击了对话框上的Button2");  
                    }  
                });  
        builder.setNegativeButton("Button3",  
                new DialogInterface.OnClickListener() {  
                    public void onClick(DialogInterface dialog, int whichButton) {  
                        setTitle("点击了对话框上的Button3");  
                    }  
                });  
        builder.create().show();  // 构建AlertDialog， 并且显示
    } 
```
