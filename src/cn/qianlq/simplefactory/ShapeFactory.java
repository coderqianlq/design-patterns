package cn.qianlq.simplefactory;

import cn.qianlq.simplefactory.object.Circle;
import cn.qianlq.simplefactory.object.Rectangle;
import cn.qianlq.simplefactory.object.Shape;
import cn.qianlq.simplefactory.object.Square;

/**
 * @author qianliqing
 * @date 2018/11/21 4:41 PM
 * email: qianliqing@hyperchain.com
 */

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
