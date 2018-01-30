package com.iotek.model;

import java.io.Serializable;

public class Company implements Serializable {
    private int c_id;
    private String c_name;
    private String c_address;
    private String c_blurb;
    private int c_phone;

    public Company() {
    }

    public Company(int c_id, String c_name, String c_address, String c_blurb, int c_phone) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_address = c_address;
        this.c_blurb = c_blurb;
        this.c_phone = c_phone;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_blurb() {
        return c_blurb;
    }

    public void setC_blurb(String c_blurb) {
        this.c_blurb = c_blurb;
    }

    public int getC_phone() {
        return c_phone;
    }

    public void setC_phone(int c_phone) {
        this.c_phone = c_phone;
    }

    @Override
    public String toString() {
        return "Company{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_address='" + c_address + '\'' +
                ", c_blurb='" + c_blurb + '\'' +
                ", c_phone=" + c_phone +
                '}';
    }
}
