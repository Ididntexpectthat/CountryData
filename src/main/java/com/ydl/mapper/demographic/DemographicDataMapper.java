package com.ydl.mapper.demographic;

import com.ydl.entity.demographicData.DemographicData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("DemographicDataMapper")
public interface DemographicDataMapper {
//    int deleteByPrimaryKey(Integer 编号);
//
//    int insert(com.ydl.entity.demographicData.DemographicData record);
//
//    int insertSelective(com.ydl.entity.demographicData.DemographicData record);
//
//    com.ydl.entity.demographicData.DemographicData selectByPrimaryKey(Integer 编号);
//
//    int updateByPrimaryKeySelective(com.ydl.entity.demographicData.DemographicData record);
//
//    int updateByPrimaryKey(com.ydl.entity.demographicData.DemographicData record);

//    Integer sum(DemographicData demographicData);

    List<DemographicData> getAllDemograhicData();

    List<DemographicData> getAllSelective(DemographicData record);
}