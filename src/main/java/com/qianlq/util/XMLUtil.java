package com.qianlq.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @date 2018/12/13 2:43 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
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
            return classNode.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Class<?> getClass(String path, String tag) {
        try {
            String className = getBean(path, tag);
            return Class.forName(className);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getObject(String path, String tag) {
        try {
            Class<?> clazz = getClass(path, tag);
            assert clazz != null;
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getBeanList(String path, String tag) {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));
            // 获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName(tag);
            List<String> beanList = new ArrayList<>(nl.getLength());
            for (int i = 0; i < nl.getLength(); ++i) {
                beanList.add(nl.item(i).getFirstChild().getNodeValue().trim());
            }
            return beanList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
