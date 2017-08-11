package com.liang.spring.api.dto;

import java.io.Serializable;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/10 16:57
 */
public class StudentDto implements Serializable{
    private String userid = "";
    private String username = "";
    private String age = "";
    private String phone = "";
    private String email = "";

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
