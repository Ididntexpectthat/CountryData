package com.ydl.service.impl;

import com.ydl.entity.EconomicData;
import com.ydl.entity.RuralPerCapitaNetIncome;
import com.ydl.mapper.RuralPerCapitaNetIncomeMapper;
import com.ydl.service.MainEconomicIndicatorsOfAgricultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainEconomicIndicatorsOfAgricultureServiceImpl implements MainEconomicIndicatorsOfAgricultureService {
    @Autowired
    RuralPerCapitaNetIncomeMapper agricultureMainEconomicIndicatorsMapper;
//    @Override
//    public List<农业主要经济指标> getDataByTableName(农业主要经济指标 mainEconomicIndicatorsOfAgriculture) {
//        return agricultureMainEconomicIndicatorsMapper.getDataByTableName(mainEconomicIndicatorsOfAgriculture);
//    }
    public List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData) {
        return agricultureMainEconomicIndicatorsMapper.getDataByTableName(economicData);
    }
}
