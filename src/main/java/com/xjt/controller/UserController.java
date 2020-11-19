package com.xjt.controller;

import com.xjt.model.User;
import com.xjt.service.IUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    //在需要使用日志的地方加上这句代码即可
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/select/{id}")
    public ModelAndView selectUser(
            @PathVariable(name = "id") long id
    ) throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(id);
        logger.info("+++++++++打印日日日日志select+++++++++++");
        mv.addObject("user", user);
        mv.setViewName("hello");
        return mv;
    }
/*
    * @Description
    * @params []
    * @return org.springframework.web.servlet.ModelAndView
    * @author sh
    * @since 2020/11/19 16:07
*/
    @RequestMapping("/select")
    @ResponseBody
    public List<User> selectAllUser() throws Exception {
        List<User> user = userService.selectAllUser();
        logger.info("+++++++++打印日日日日志select+++++++++++");
        return user;
    }

    @PostMapping("/insert")
    @ResponseBody
    public User insertUser(
//            @RequestParam(value = "id") int id,
//            @RequestParam(value = "email") String email,
//            @RequestParam(value = "username") String username,
//            @RequestParam(value = "role") String role,
//            @RequestParam(value = "mobile") String mobile
            @RequestBody User user
//             @RequestParam(value = "id") int id,

    ) throws Exception{
//        long id = 23;
//        String email = "2432423@qqnvv";
//        String username = "dsfsd";
//        String role = "admin";
//        String mobile = "15545";
//        User user =new User();
//        user.setId(id);
//        user.setEmail(email);
//        user.setUsername(username);
//        user.setRole(role);
//        user.setMobile(mobile);
//        String getemail = user.getEmail();
        logger.info("日志 getEmail = {}",user.getMobile());
        userService.insertUser(user);
        return user;
    }
}
