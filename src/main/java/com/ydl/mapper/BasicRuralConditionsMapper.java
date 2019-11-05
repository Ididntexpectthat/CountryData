package com.ydl.mapper;

import com.ydl.entity.BasicRuralConditions;
import com.ydl.entity.economicData.EconomicData;

import java.util.List;

public interface BasicRuralConditionsMapper {
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(BasicRuralConditions record);
//
//    int insertSelective(BasicRuralConditions record);
//
//    BasicRuralConditions selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(BasicRuralConditions record);
//
//    int updateByPrimaryKey(BasicRuralConditions record);

    List<BasicRuralConditions> getDataByTableName(EconomicData economicData);
}