package com.qianlq.templatemethod.example;

import com.qianlq.templatemethod.example.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-14 21:13
 */

public class JdbcTemplateUserImpl extends JdbcTemplate {

    @Override
    protected Object doResultSet(ResultSet rs) {
        List<User> userList = new ArrayList<>();
        try {
            User user;
            while (rs.next()) {
                user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setPhone(rs.getString("phone"));
                user.setBirth(rs.getDate("birth"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
