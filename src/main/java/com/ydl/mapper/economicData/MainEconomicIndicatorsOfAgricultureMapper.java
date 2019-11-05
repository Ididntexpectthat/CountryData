package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.MainEconomicIndicatorsOfAgriculture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("MainEconomicIndicatorsOfAgricultureMapper")
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