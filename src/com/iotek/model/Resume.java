package com.iotek.model;

import java.io.Serializable;

public class Resume implements Serializable{
    private int r_id;
    private String r_name;
    private String r_sex;
    private String r_photo;
    private String r_national;
    private String r_school;
    private String r_degree;
    private String r_professional;
    private String r_phone;
    private String r_email;
    private String r_birthday;
    private String r_intention;
    private String r_skills;
    private String r_experience;
    private String r_self;
    private User user;

    public Resume() {
    }

    public Resume(int r_id, String r_name, String r_sex, String r_photo, String r_national, String r_school, String r_degree, String r_professional, String r_phone, String r_email, String r_birthday, String r_intention, String r_skills, String r_experience, String r_self, User user) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_sex = r_sex;
        this.r_photo = r_photo;
        this.r_national = r_national;
        this.r_school = r_school;
        this.r_degree = r_degree;
        this.r_professional = r_professional;
        this.r_phone = r_phone;
        this.r_email = r_email;
        this.r_birthday = r_birthday;
        this.r_intention = r_intention;
        this.r_skills = r_skills;
        this.r_experience = r_experience;
        this.r_self = r_self;
        this.user = user;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_photo() {
        return r_photo;
    }

    public void setR_photo(String r_photo) {
        this.r_photo = r_photo;
    }

    public String getR_national() {
        return r_national;
    }

    public void setR_national(String r_national) {
        this.r_national = r_national;
    }

    public String getR_school() {
        return r_school;
    }

    public void setR_school(String r_school) {
        this.r_school = r_school;
    }

    public String getR_degree() {
        return r_degree;
    }

    public void setR_degree(String r_degree) {
        this.r_degree = r_degree;
    }

    public String getR_professional() {
        return r_professional;
    }

    public void setR_professional(String r_professional) {
        this.r_professional = r_professional;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_email() {
        return r_email;
    }

    public void setR_email(String r_email) {
        this.r_email = r_email;
    }

    public String getR_birthday() {
        return r_birthday;
    }

    public void setR_birthday(String r_birthday) {
        this.r_birthday = r_birthday;
    }

    public String getR_intention() {
        return r_intention;
    }

    public void setR_intention(String r_intention) {
        this.r_intention = r_intention;
    }

    public String getR_skills() {
        return r_skills;
    }

    public void setR_skills(String r_skills) {
        this.r_skills = r_skills;
    }

    public String getR_experience() {
        return r_experience;
    }

    public void setR_experience(String r_experience) {
        this.r_experience = r_experience;
    }

    public String getR_self() {
        return r_self;
    }

    public void setR_self(String r_self) {
        this.r_self = r_self;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_sex='" + r_sex + '\'' +
                ", r_photo='" + r_photo + '\'' +
                ", r_national='" + r_national + '\'' +
                ", r_school='" + r_school + '\'' +
                ", r_degree='" + r_degree + '\'' +
                ", r_professional='" + r_professional + '\'' +
                ", r_phone='" + r_phone + '\'' +
                ", r_email='" + r_email + '\'' +
                ", r_birthday='" + r_birthday + '\'' +
                ", r_intention='" + r_intention + '\'' +
                ", r_skills='" + r_skills + '\'' +
                ", r_experience='" + r_experience + '\'' +
                ", r_self='" + r_self + '\'' +
                ", user=" + user +
                '}';
    }
}
