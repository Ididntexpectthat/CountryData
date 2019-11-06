package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.MainEconomicIndicatorsOfAgriculture;
import com.ydl.mapper.economicData.MainEconomicIndicatorsOfAgricultureMapper;
import com.ydl.service.economicData.MainEconomicIndicatorsOfAgricultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainEconomicIndicatorsOfAgricultureServiceImpl implements MainEconomicIndicatorsOfAgricultureService {
    @Autowired
    MainEconomicIndicatorsOfAgricultureMapper mainEconomicIndicatorsOfAgricultureMapper;
//    @Override
//    public List<农业主要经济指标> getDataByTableName(农业主要经济指标 mainEconomicIndicatorsOfAgriculture) {
//        return agricultureMainEconomicIndicatorsMapper.getDataByTableName(mainEconomicIndicatorsOfAgriculture);
//    }
    public List<MainEconomicIndicatorsOfAgriculture> getDataByTableName(EconomicData economicData) {
        return mainEconomicIndicatorsOfAgricultureMapper.getDataByTableName(economicData);
    }
}
