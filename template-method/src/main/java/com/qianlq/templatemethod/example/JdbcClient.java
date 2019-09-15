package com.qianlq.templatemethod.example;

/**
 * @author qianliqing
 * @date 2019-09-14 21:22
 * @since v1.0
 */

public class JdbcClient {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplateUserImpl();
        Object execute = jdbcTemplate.execute("select * from user");
        System.out.println(execute);
    }
}
