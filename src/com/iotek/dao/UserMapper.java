package com.iotek.dao;

import com.iotek.model.User;

public interface UserMapper {
    User getUser(User user);
    User getUserByName(User user);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean updateAttribute(User user);
}
