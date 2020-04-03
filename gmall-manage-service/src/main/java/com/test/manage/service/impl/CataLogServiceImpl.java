package com.test.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.manage.mapper.PmsBaseCatalog1Mapper;
import com.test.manage.mapper.PmsBaseCatalog2Mapper;
import com.test.manage.mapper.PmsBaseCatalog3Mapper;
import com.test.user.bean.PmsBaseCatalog1;
import com.test.user.bean.PmsBaseCatalog2;
import com.test.user.bean.PmsBaseCatalog3;
import com.test.user.service.CataLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CataLogServiceImpl implements CataLogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {

        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setId(catalog1Id);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {

        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setId(catalog2Id);
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
        return pmsBaseCatalog3s;
    }
}
