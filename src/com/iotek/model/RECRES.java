package com.iotek.model;

import java.io.Serializable;

public class RECRES implements Serializable {
    private int rr_id;
    private Resume resume;
    private Recruitment recruitment;
    private int rr_attribute;

    public RECRES() {
    }

    public RECRES(int rr_id, Resume resume, Recruitment recruitment, int rr_attribute) {
        this.rr_id = rr_id;
        this.resume = resume;
        this.recruitment = recruitment;
        this.rr_attribute = rr_attribute;
    }

    public int getRr_id() {
        return rr_id;
    }

    public void setRr_id(int rr_id) {
        this.rr_id = rr_id;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    public int getRr_attribute() {
        return rr_attribute;
    }

    public void setRr_attribute(int rr_attribute) {
        this.rr_attribute = rr_attribute;
    }

    @Override
    public String toString() {
        return "RECRES{" +
                "rr_id=" + rr_id +
                ", resume=" + resume +
                ", recruitment=" + recruitment +
                ", rr_attribute=" + rr_attribute +
                '}';
    }
}
