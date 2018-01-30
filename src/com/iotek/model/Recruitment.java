package com.iotek.model;

import java.io.Serializable;

public class Recruitment implements Serializable {
    private int id;
    private Company company;
    private Job job;
    private float rm_money;
    private String rm_requirement;
    private int rm_people;

    public Recruitment() {
    }

    public Recruitment(int id, Company company, Job job, float rm_money, String rm_requirement, int rm_people) {
        this.id = id;
        this.company = company;
        this.job = job;
        this.rm_money = rm_money;
        this.rm_requirement = rm_requirement;
        this.rm_people = rm_people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public float getRm_money() {
        return rm_money;
    }

    public void setRm_money(float rm_money) {
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
                "id=" + id +
                ", company=" + company +
                ", job=" + job +
                ", rm_money=" + rm_money +
                ", rm_requirement='" + rm_requirement + '\'' +
                ", rm_people=" + rm_people +
                '}';
    }
}
