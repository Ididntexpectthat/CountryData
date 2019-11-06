package com.ydl.service.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.GDPStatistics;

import java.util.List;

public interface GDPStatisticsService {
//    List<生产总值统计> getDataByTableName(生产总值统计 grossProduct);
    List<GDPStatistics> getDataByTableName(EconomicData economicData);
}
