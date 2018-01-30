package com.iotek.model;

import java.io.Serializable;
import java.security.Principal;

public class Job implements Serializable {
    private int j_id;
    private String j_name;

    public Job() {
    }

    public Job(int j_id, String j_name) {
        this.j_id = j_id;
        this.j_name = j_name;
    }

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
    }

    public String getJ_name() {
        return j_name;
    }

    public void setJ_name(String j_name) {
        this.j_name = j_name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "j_id=" + j_id +
                ", j_name='" + j_name + '\'' +
                '}';
    }
}
