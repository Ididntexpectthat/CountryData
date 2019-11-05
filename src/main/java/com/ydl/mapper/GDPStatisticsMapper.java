package com.ydl.mapper;

import com.ydl.entity.EconomicData;
import com.ydl.entity.GDPStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GDPStatisticsMapper {
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(生产总值统计 record);
//
//    int insertSelective(生产总值统计 record);
//
//    生产总值统计 selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(生产总值统计 record);
//
//    int updateByPrimaryKey(生产总值统计 record);

//    List<生产总值统计> getDataByTableName(@Param("grossProduct")生产总值统计 grossProduct);
    List<GDPStatistics> getDataByTableName(EconomicData economicData);
}