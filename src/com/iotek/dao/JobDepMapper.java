package com.iotek.dao;

import com.iotek.model.Department;
import com.iotek.model.Job;

import java.util.List;

public interface JobDepMapper {
    boolean addJob(Job job);
    boolean addDep(Department department);
    boolean updateJob(Job job);
    boolean updateDep(Department department);
    Job getJobById(Job job);
    List<Job> getJobByName(Job job);
    List<Job> getAllJob();
    Department getDepartmentById(Department department);
    List<Department> getDepartmentByName(Department department);
    List<Department> getAllDepartment();
}
