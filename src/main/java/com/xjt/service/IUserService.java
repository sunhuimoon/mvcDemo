package com.xjt.service;

import com.xjt.model.User;

import java.util.List;

public interface IUserService {

    public User selectUser(long userId);
    public void insertUser(User user);
    public List<User> selectAllUser();
}
