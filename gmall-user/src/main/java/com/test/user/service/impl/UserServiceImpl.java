package com.test.user.service.impl;

import com.test.user.bean.UmsMember;
import com.test.user.mapper.UserMapper;
import com.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }
}
