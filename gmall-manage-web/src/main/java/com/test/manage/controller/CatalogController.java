package com.test.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.user.bean.PmsBaseCatalog1;
import com.test.user.bean.PmsBaseCatalog2;
import com.test.user.bean.PmsBaseCatalog3;
import com.test.user.service.CataLogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CatalogController {

    @Reference
    CataLogService cataLogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){

        List<PmsBaseCatalog1> catalog1s = cataLogService.getCatalog1();

        return catalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){

        List<PmsBaseCatalog2> catalog2s = cataLogService.getCatalog2(catalog1Id);

        return catalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){

        List<PmsBaseCatalog3> catalog3s = cataLogService.getCatalog3(catalog2Id);

        return catalog3s;
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "hello user springboot!";
    }

}
