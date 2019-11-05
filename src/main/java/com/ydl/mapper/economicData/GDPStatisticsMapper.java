package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.GDPStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("GDPStatisticsMapper")
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