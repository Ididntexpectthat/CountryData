package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.BasicSocialSituation2_2016;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasicSocialSituation2_2016Mapper {
    List<Object> getDataByTableName();
//    int insert(BasicSocialSituation2_2016 record);
//
//    int insertSelective(BasicSocialSituation2_2016 record);
}