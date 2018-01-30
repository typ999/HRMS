package com.iotek.service.impl;

import com.iotek.dao.RecruitmentMapper;
import com.iotek.model.Recruitment;
import com.iotek.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService {
    @Resource
    private RecruitmentMapper recruitmentMapper;
    @Override
    public boolean addRecruitment(Recruitment recruitment) {
        return recruitmentMapper.addRecruitment(recruitment);
    }

    @Override
    public boolean updateRecruitment(Recruitment recruitment) {
        return recruitmentMapper.updateRecruitment(recruitment);
    }

    @Override
    public List<Recruitment> getAll() {
        return recruitmentMapper.getAll();
    }

    @Override
    public List<Recruitment> getLike(Recruitment recruitment) {
        return null;
    }
}
