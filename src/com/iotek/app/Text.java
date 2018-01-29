package com.iotek.app;

import com.iotek.model.User;
import com.iotek.service.UserService;
import com.iotek.service.impl.UserServiceImpl;

public class Text {
    public static void main(String[] args) {
        User user = new User();
        user.setU_name("qwe123");
        user.setU_pass("qwe123");
        UserService userService = new UserServiceImpl();
        System.out.println(userService.login(user));
    }
}
