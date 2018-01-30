package com.iotek.controller;

import com.iotek.model.Company;
import com.iotek.model.Department;
import com.iotek.model.Job;
import com.iotek.model.Recruitment;
import com.iotek.service.CompanyService;
import com.iotek.service.JobDepService;
import com.iotek.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class RecruitmentController {
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private CompanyService companyService;
    @Resource
    private JobDepService jobDepService;
    @RequestMapping(value = "/addCompany",method = RequestMethod.POST)
    public String addCompany(Company company) throws Exception{
        if (companyService.addCompany(company)){
            return "success2";
        }
        return "success2";
    }
    @RequestMapping(value = "/addJob",method = RequestMethod.POST)
    public String addJob(Job job) throws Exception{
        if (jobDepService.addJob(job)){
            return "success2";
        }
        return "success2";
    }
    @RequestMapping(value = "/addDep",method = RequestMethod.POST)
    public String addDep(Department dep) throws Exception{
        if (jobDepService.addDep(dep)){
            return "success2";
        }
        return "success2";
    }
    @RequestMapping(value = "/addRec",method = RequestMethod.POST)
    public String addRec(Recruitment rec) throws Exception{
        System.out.println(rec);
        if (recruitmentService.addRecruitment(rec)){
            return "success2";
        }
        return "success2";
    }
}
