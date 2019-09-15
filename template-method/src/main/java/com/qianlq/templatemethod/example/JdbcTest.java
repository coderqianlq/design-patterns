package com.qianlq.templatemethod.example;

import com.qianlq.templatemethod.example.constant.ConnectionConstant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author qianliqing
 * @date 2019-09-14 20:34
 * @since v1.0
 */

public class JdbcTest {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 建立数据库连接
            conn = DriverManager.getConnection(ConnectionConstant.URL, ConnectionConstant.USERNAME, ConnectionConstant.PASSWORD);
            // 创建jdbc statement对象
            st = conn.createStatement();
            // 通过statement执行sql并获取结果
            rs = st.executeQuery("select * from user");
            // 对sql执行结果进行解析处理
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源:resultSet,statement,connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
