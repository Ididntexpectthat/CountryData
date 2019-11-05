package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.BasicRuralConditions;
import com.ydl.entity.economicData.EconomicData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("BasicRuralConditionsMapper")
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