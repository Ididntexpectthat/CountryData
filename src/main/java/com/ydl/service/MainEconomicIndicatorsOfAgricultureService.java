package com.ydl.service;

import com.ydl.entity.EconomicData;
import com.ydl.entity.农业主要经济指标;

import java.util.List;

public interface MainEconomicIndicatorsOfAgricultureService {
//    List<农业主要经济指标> getDataByTableName(农业主要经济指标 mainEconomicIndicatorsOfAgriculture);
    List<农业主要经济指标> getDataByTableName(EconomicData economicData);
}
