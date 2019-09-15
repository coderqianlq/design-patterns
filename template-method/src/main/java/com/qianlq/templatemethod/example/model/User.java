package com.qianlq.templatemethod.example.model;

import java.util.Date;

/**
 * @author qianliqing
 * @date 2019-09-14 21:16
 * @since v1.0
 */

public class User {

    private String id;

    private String name;

    private String phone;

    private Date birth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "id:" + id + ", name:" + name + ", phone:" + phone + ", birth:" + birth;
    }
}
