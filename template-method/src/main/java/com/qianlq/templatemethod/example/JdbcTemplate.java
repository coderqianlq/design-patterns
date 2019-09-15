package com.qianlq.templatemethod.example;

import com.qianlq.templatemethod.example.constant.ConnectionConstant;

import java.sql.*;

/**
 * @author qianliqing
 * @date 2019-09-14 20:59
 * @since v1.0
 */

public abstract class JdbcTemplate {

    public final Object execute(String sql) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Object object = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ConnectionConstant.URL, ConnectionConstant.USERNAME, ConnectionConstant.PASSWORD);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            object = doResultSet(rs);
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
        return object;
    }


    /**
     * 遍历ResultSet并封装成集合交给具体子类处理
     *
     * @param rs ResultSet
     * @return Object
     */
    protected abstract Object doResultSet(ResultSet rs);
}
