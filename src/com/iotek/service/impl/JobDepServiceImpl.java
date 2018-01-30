package com.iotek.service.impl;

import com.iotek.dao.JobDepMapper;
import com.iotek.model.Department;
import com.iotek.model.Job;
import com.iotek.service.JobDepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("JobDepService")
public class JobDepServiceImpl implements JobDepService {
    @Resource
    private JobDepMapper jobDepMapper;
    @Override
    public boolean addJob(Job job) {
        return jobDepMapper.addJob(job);
    }

    @Override
    public boolean addDep(Department department) {
        return jobDepMapper.addDep(department);
    }

    @Override
    public boolean updateJob(Job job) {
        return jobDepMapper.updateJob(job);
    }

    @Override
    public boolean updateDep(Department department) {
        return jobDepMapper.updateDep(department);
    }

    @Override
    public Job getJobById(Job job) {
        return jobDepMapper.getJobById(job);
    }

    @Override
    public List<Job> getJobByName(Job job) {
        return jobDepMapper.getJobByName(job);
    }

    @Override
    public List<Job> getAllJob() {
        return jobDepMapper.getAllJob();
    }

    @Override
    public Department getDepartmentById(Department department) {
        return jobDepMapper.getDepartmentById(department);
    }

    @Override
    public List<Department> getDepartmentByName(Department department) {
        return jobDepMapper.getDepartmentByName(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return jobDepMapper.getAllDepartment();
    }
}
