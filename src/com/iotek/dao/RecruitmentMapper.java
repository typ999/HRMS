package com.iotek.dao;

import com.iotek.model.Recruitment;

import java.util.List;

public interface RecruitmentMapper {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    List<Recruitment> getAll();
    List<Recruitment> getLike(Recruitment recruitment);
}
