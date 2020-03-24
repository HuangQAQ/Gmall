package com.test.gmalluser.service;

import com.test.gmalluser.bean.UmsMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UmsMember> getAllUser();
}
