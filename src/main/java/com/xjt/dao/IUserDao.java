package com.xjt.dao;

import com.xjt.model.User;

import java.util.List;

public interface IUserDao {

    User selectUser(long id);
    void insertUser(User user);
    List<User> selectAllUser();
}
