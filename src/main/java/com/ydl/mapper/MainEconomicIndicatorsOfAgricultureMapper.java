package com.ydl.mapper;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.MainEconomicIndicatorsOfAgriculture;

import java.util.List;

public interface MainEconomicIndicatorsOfAgricultureMapper {
    //    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(MainEconomicIndicatorsOfAgriculture record);
//
//    int insertSelective(MainEconomicIndicatorsOfAgriculture record);
//
//    MainEconomicIndicatorsOfAgriculture selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(MainEconomicIndicatorsOfAgriculture record);
//
//    int updateByPrimaryKey(MainEconomicIndicatorsOfAgriculture record);
    List<MainEconomicIndicatorsOfAgriculture> getDataByTableName(EconomicData economicData);
}