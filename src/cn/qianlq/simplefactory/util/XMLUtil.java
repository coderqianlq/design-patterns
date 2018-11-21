package cn.qianlq.simplefactory.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author qianliqing
 * @date 2018/11/21 8:14 PM
 * email: qianliqing@hyperchain.com
 */

public class XMLUtil {

    public static String getChartType() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/cn/qianlq/simplefactory/config/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("shapeType");
            Node classNode = nl.item(0).getFirstChild();
            String shapeType = classNode.getNodeValue().trim();
            return shapeType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
