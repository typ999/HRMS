package com.iotek.controller;

import com.iotek.model.Company;
import com.iotek.model.User;
import com.iotek.service.CompanyService;
import com.iotek.service.JobDepService;
import com.iotek.service.RecruitmentService;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private CompanyService companyService;
    @Resource
    private JobDepService jobDepService;

    @RequestMapping("/forAddJsp")
    public String forAddJsp()throws Exception{
        return "addUser";
    }
    @RequestMapping("/forlongeJsp")
    public String forlongeJsp()throws Exception{
        return "longe";
    }
    @RequestMapping("/foraddResumeJsp")
    public String foraddResumeJsp()throws Exception{
        return "addResume";
    }
    @RequestMapping("/forsuccessJsp")
    public String forsuccessJsp(HttpSession session)throws Exception{
        session.setAttribute("recruitments",recruitmentService.getAll());
        return "success";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user,HttpSession session)throws Exception{
        User user1 = userService.login(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            if (user1.getU_attribute()==0){
                session.setAttribute("recruitments",recruitmentService.getAll());
                session.setAttribute("companys",companyService.getAll());
                session.setAttribute("jobs",jobDepService.getAllJob());
                session.setAttribute("departments",jobDepService.getAllDepartment());
                return "success";
            }if (user1.getU_attribute()==1){

            }if (user1.getU_attribute()==2){
                session.setAttribute("companys",companyService.getAll());
                session.setAttribute("jobs",jobDepService.getAllJob());
                session.setAttribute("departments",jobDepService.getAllDepartment());
                return "success2";
            }
        }
        return "longe";
    }

    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public String addUser(User user){
        if (userService.addUser(user)){
            return "login";
        }
        return "addUser";
    }

    @RequestMapping(value = "/checkName",method = RequestMethod.POST)
    public @ResponseBody
    String checkName(User user) throws Exception{
        User user1 = userService.check(user);
        if (user1!=null){
            String str = "用户已存在";
            return str;
        }
        return "输入成功";
    }
    @RequestMapping(value = "/longeName",method = RequestMethod.POST)
    public @ResponseBody
    String longeName(User user) throws Exception{
        User user1 = userService.check(user);
        if (user1==null){
            String str = "用户不存在";
            return str;
        }
        return "";
    }
    @RequestMapping(value = "/longePass",method = RequestMethod.POST)
    public @ResponseBody
    String longePass(User user) throws Exception{
        User user1 = userService.login(user);
        if (user1==null){
            String str = "密码错误";
            return str;
        }
        return "";
    }
}
