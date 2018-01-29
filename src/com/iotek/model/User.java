package com.iotek.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private int u_id;
    private String u_name;
    private String u_pass;
    private int u_attribute;

    public User() {
    }

    public User(int u_id, String u_name, String u_pass, int u_attribute) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pass = u_pass;
        this.u_attribute = u_attribute;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public int getU_attribute() {
        return u_attribute;
    }

    public void setU_attribute(int u_attribute) {
        this.u_attribute = u_attribute;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", u_attribute=" + u_attribute +
                '}';
    }
}
