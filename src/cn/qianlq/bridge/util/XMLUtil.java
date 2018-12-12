package cn.qianlq.bridge.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author qianliqing
 * @date 2018/12/11 8:04 PM
 * email: qianliqing@hyperchain.com
 */

public class XMLUtil {

    public static Class getClass(String tagName) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();

            Document doc;
            doc = builder.parse(new File("src/cn/qianlq/bridge/config/config.xml"));

            NodeList nl = doc.getElementsByTagName(tagName);
            Node node = nl.item(0).getFirstChild();

            String name = node.getNodeValue();
            Class clazz = Class.forName(name);
//            Object obj = clazz.newInstance();
            return clazz;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
