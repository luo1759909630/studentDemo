package com.gen.student.domain;

import java.io.Serializable;

public class department implements Serializable {
//    department表：id、name；
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
