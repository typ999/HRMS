package com.iotek.service.impl;

import com.iotek.dao.UserMapper;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User user1 = userMapper.getUser(user);
        if (user1!=null){
            return user1;
        }
        return null;
    }

    @Override
    public User check(User user) {
        User user1 = userMapper.getUserByName(user);
        if (user1!=null){
            return user1;
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
