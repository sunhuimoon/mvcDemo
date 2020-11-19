package com.xjt.dao;

import com.xjt.model.User;

public interface IUserDao {

    User selectUser(long id);
    void insertUser(User user);
}
