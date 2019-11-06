package com.ydl.mapper.economicData;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("BasicSocialSituation1_2014Mapper")
public interface BasicSocialSituation1_2014Mapper {
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(BasicSocialSituation1_2014 record);
//
//    int insertSelective(BasicSocialSituation1_2014 record);
//
//    BasicSocialSituation1_2014 selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(BasicSocialSituation1_2014 record);
//
//    int updateByPrimaryKey(BasicSocialSituation1_2014 record);

    List<Object> getDataByTableName();
}