package com.nhan.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class User {
    @NotNull(message = "Tên không được để rỗng")
    @Size(min = 5, max = 30, message = "Tên phải từ 5 đến 30 ký tự")
    private String name;

    @Min(value = 18, message = "Trên 18 tuổi")
    private int age;

    @NotNull(message = "Email không được để rỗng")
    @Email(message = "Sai định dạng email", regexp = "[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]+")
    private String email;

    private String gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Ngày sinh phải lớn hơn ngày hiện tại")
    //@TestDay
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
