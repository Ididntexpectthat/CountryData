package com.ydl.service;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.MainEconomicIndicatorsOfAgriculture;

import java.util.List;

public interface MainEconomicIndicatorsOfAgricultureService {
//    List<农业主要经济指标> getDataByTableName(农业主要经济指标 mainEconomicIndicatorsOfAgriculture);
    List<MainEconomicIndicatorsOfAgriculture> getDataByTableName(EconomicData economicData);
}
