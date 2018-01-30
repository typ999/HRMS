package com.iotek.service;

import com.iotek.model.User;

public interface UserService {
    User login(User user);
    User check(User user);
    boolean addUser(User user);
    boolean updateUser(User user);
}
