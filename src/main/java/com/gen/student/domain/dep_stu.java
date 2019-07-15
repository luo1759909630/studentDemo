package com.gen.student.domain;

import java.io.Serializable;

public class dep_stu implements Serializable {
//    dep_stu关联表：id、dep_id、stu_id
    private int id;
    private int dep_id;
    private int stu_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}
