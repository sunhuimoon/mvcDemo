package com.xjt.service.impl;

import com.xjt.controller.UserController;
import com.xjt.dao.IUserDao;
import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
    public void insertUser(User user){
        logger.info("日志 ===== 进入userService====insertUser");
        userDao.insertUser(user);
    }
}
