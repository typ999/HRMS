package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.rmi.server.RemoteServer;
import java.util.List;

@Controller
public class ResumesController {
    @Resource
    private ResumeService resumeService;

    @RequestMapping(value = "/getResumes",method = RequestMethod.POST)
    public String addDetail(HttpServletRequest request) throws Exception{
        User user= (User) request.getSession().getAttribute("user");
        Resume resume = new Resume();
        resume.setUser(user);
        request.getSession().setAttribute("resumes",resumeService.getDetailByUid(resume));
        return "getResume";
    }
    @RequestMapping(value = "/addResume",method = RequestMethod.POST)
    public String addDetail(Resume resume,HttpServletRequest request) throws Exception{
        User user= (User) request.getSession().getAttribute("user");
        resume.setUser(user);
        List<Resume> resumes = resumeService.getDetailByUid(resume);
        if (resumes.size()==0){
            resumeService.addResume(resume);
        }else {
            resumeService.updateResume(resume);
        }
        request.getSession().setAttribute("resumes",resume);
        return "listdetails";
    }

}
