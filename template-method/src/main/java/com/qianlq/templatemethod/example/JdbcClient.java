package com.qianlq.templatemethod.example;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-14 21:22
 */

public class JdbcClient {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplateUserImpl();
        Object execute = jdbcTemplate.execute("select * from user");
        System.out.println(execute);
    }
}
