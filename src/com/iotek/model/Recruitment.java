package com.iotek.model;

import java.io.Serializable;

public class Recruitment implements Serializable {
    private int rm_id;
    private int c_id;
    private int j_id;
    private int rm_money;
    private String rm_requirement;
    private int rm_people;

    public Recruitment() {
    }

    public Recruitment(int rm_id, int c_id, int j_id, int rm_money, String rm_requirement, int rm_people) {
        this.rm_id = rm_id;
        this.c_id = c_id;
        this.j_id = j_id;
        this.rm_money = rm_money;
        this.rm_requirement = rm_requirement;
        this.rm_people = rm_people;
    }

    public int getRm_id() {
        return rm_id;
    }

    public void setRm_id(int rm_id) {
        this.rm_id = rm_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
    }

    public int getRm_money() {
        return rm_money;
    }

    public void setRm_money(int rm_money) {
        this.rm_money = rm_money;
    }

    public String getRm_requirement() {
        return rm_requirement;
    }

    public void setRm_requirement(String rm_requirement) {
        this.rm_requirement = rm_requirement;
    }

    public int getRm_people() {
        return rm_people;
    }

    public void setRm_people(int rm_people) {
        this.rm_people = rm_people;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "rm_id=" + rm_id +
                ", c_id=" + c_id +
                ", j_id=" + j_id +
                ", rm_money=" + rm_money +
                ", rm_requirement='" + rm_requirement + '\'' +
                ", rm_people=" + rm_people +
                '}';
    }
}
