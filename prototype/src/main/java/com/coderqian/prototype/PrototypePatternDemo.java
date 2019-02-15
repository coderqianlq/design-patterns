package com.coderqian.prototype;

import com.coderqian.prototype.object.Circle;
import com.coderqian.prototype.object.Shape;

import java.io.*;

/**
 * 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
 * 浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
 */

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:40
 * email: qianlq0824@gmail.com
 */

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        Circle circle = new Circle();

        Circle clonedCircle;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(circle);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedCircle = (Circle) ois.readObject();
            ois.close();

            System.out.println("clone type: " + clonedCircle.getType());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
