package com.example.leeco.myapplication.jsons;

/**
 * Created by leeco on 16/8/3.
 */

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}