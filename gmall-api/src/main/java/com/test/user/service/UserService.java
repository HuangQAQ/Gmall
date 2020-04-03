package com.test.user.service;

import com.test.user.bean.UmsMember;
import org.springframework.stereotype.Service;


import java.util.List;


public interface UserService {
    List<UmsMember> getAllUser();
}
