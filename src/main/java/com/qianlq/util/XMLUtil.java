package com.qianlq.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author qianliqing
 * @date 2018/12/13 2:43 PM
 * email: qianlq0824@gmail.com
 */

public class XMLUtil {

    public static String getBean(String path, String tag) {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));
            // 获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName(tag);
            Node classNode = nl.item(0).getFirstChild();
            String bean = classNode.getNodeValue().trim();
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Class getClass(String path, String tag) {
        try {
            String className = getBean(path, tag);
            Class clazz = Class.forName(className);
            return clazz;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getObject(String path, String tag) {
        try {
            Class clazz = getClass(path, tag);
            Object obj = clazz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
