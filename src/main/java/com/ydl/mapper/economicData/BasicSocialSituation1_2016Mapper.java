package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.BasicSocialSituation1_2016;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasicSocialSituation1_2016Mapper {
    List<Object> getDataByTableName();
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(BasicSocialSituation1_2016 record);
//
//    int insertSelective(BasicSocialSituation1_2016 record);
//
//    BasicSocialSituation1_2016 selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(BasicSocialSituation1_2016 record);
//
//    int updateByPrimaryKey(BasicSocialSituation1_2016 record);
}