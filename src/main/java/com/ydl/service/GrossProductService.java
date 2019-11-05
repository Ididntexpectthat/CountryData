package com.ydl.service;

import com.ydl.entity.EconomicData;
import com.ydl.entity.GDPStatistics;

import java.util.List;

public interface GrossProductService {
//    List<生产总值统计> getDataByTableName(生产总值统计 grossProduct);
    List<GDPStatistics> getDataByTableName(EconomicData economicData);
}
