package com.qianlq.filter.object;

/**
 * @author qianliqing
 * @date 2018-10-08 下午7:32
 * mail: qianlq0824@gmail.com
 */

public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person : [ Name : " + this.getName()
                + ", Gender : " + this.getGender()
                + ", Marital Status : " + this.getMaritalStatus()
                + " ]";
    }
}
