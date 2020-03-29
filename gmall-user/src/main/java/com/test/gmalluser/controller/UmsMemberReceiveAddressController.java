package com.test.gmalluser.controller;

import com.test.gmalluser.bean.UmsMemberReceiveAddress;
import com.test.gmalluser.service.UmsMemberReceiveAddressService;
import com.test.gmalluser.service.impl.UmsMemberReceiveAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UmsMemberReceiveAddressController {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @GetMapping("findAllAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> findAllAddress(){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressService.findAllAddress();
        return umsMemberReceiveAddresses;
    }

    @DeleteMapping("Address")
    @ResponseBody
    public void deleteAddressById(){
        umsMemberReceiveAddressService.deleteAddressById();
    }

}
