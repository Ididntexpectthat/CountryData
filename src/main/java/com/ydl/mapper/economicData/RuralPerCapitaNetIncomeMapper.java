package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.RuralPerCapitaNetIncome;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("RuralPerCapitaNetIncomeMapper")
public interface RuralPerCapitaNetIncomeMapper {
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(RuralPerCapitaNetIncome record);
//
//    int insertSelective(RuralPerCapitaNetIncome record);
//
//    RuralPerCapitaNetIncome selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(RuralPerCapitaNetIncome record);
//
//    int updateByPrimaryKey(RuralPerCapitaNetIncome record);

    List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData);
}