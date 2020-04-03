package com.test.user.service;

import com.test.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> findAllAddress();

    void deleteAddressById();
}
