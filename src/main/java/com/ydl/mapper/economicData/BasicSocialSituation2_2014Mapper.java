package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.BasicSocialSituation2_2014;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasicSocialSituation2_2014Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(BasicSocialSituation2_2014 record);

    int insertSelective(BasicSocialSituation2_2014 record);

    BasicSocialSituation2_2014 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(BasicSocialSituation2_2014 record);

    int updateByPrimaryKey(BasicSocialSituation2_2014 record);

    List<BasicSocialSituation2_2014> getAll();
}