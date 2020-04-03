package com.test.user.service.impl;

import com.test.user.bean.UmsMemberReceiveAddress;
import com.test.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    private Object UmsMemberReceiveAddress;

    @Override
    public List<UmsMemberReceiveAddress> findAllAddress() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectAll();
        return umsMemberReceiveAddresses;
    }

    @Override
    public void deleteAddressById() {
        umsMemberReceiveAddressMapper.deleteByPrimaryKey(UmsMemberReceiveAddress);
        return ;
    }


}
