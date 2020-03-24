package com.test.gmalluser.service;

import com.test.gmalluser.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> findAllAddress();
}
