package com.test.user.controller;

import com.test.user.bean.UmsMemberReceiveAddress;
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
