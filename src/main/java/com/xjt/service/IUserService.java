package com.xjt.service;

import com.xjt.model.User;

public interface IUserService {

    public User selectUser(long userId);
    public void insertUser(User user);
}
