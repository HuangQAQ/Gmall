package com.test.user.service;

import com.test.user.bean.PmsBaseCatalog1;
import com.test.user.bean.PmsBaseCatalog2;
import com.test.user.bean.PmsBaseCatalog3;

import java.util.List;

public interface CataLogService {
    List<PmsBaseCatalog1> getCatalog1();
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
