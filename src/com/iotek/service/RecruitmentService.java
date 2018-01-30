package com.iotek.service;

import com.iotek.model.Recruitment;

import java.util.List;

public interface RecruitmentService {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    List<Recruitment> getAll();
    List<Recruitment> getLike(Recruitment recruitment);
}
