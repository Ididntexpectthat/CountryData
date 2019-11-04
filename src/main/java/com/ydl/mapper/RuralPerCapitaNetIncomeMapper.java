package com.ydl.mapper;

import com.ydl.entity.EconomicData;
import com.ydl.entity.RuralPerCapitaNetIncome;

import java.util.List;

public interface RuralPerCapitaNetIncomeMapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(RuralPerCapitaNetIncome record);

    int insertSelective(RuralPerCapitaNetIncome record);

    RuralPerCapitaNetIncome selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(RuralPerCapitaNetIncome record);

    int updateByPrimaryKey(RuralPerCapitaNetIncome record);

    List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData);
}