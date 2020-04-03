package com.test.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.test.user.bean.UmsMember;
import com.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "hello user springboot!";
    }
}
