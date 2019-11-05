package com.ydl.mapper.经济数据;

import com.ydl.entity.经济数据.BasicSocialSituation2_2014;

import java.util.List;

public interface BasicSocialSituation2_2014Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(BasicSocialSituation2_2014 record);

    int insertSelective(BasicSocialSituation2_2014 record);

    BasicSocialSituation2_2014 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(BasicSocialSituation2_2014 record);

    int updateByPrimaryKey(BasicSocialSituation2_2014 record);

    List<BasicSocialSituation2_2014> getAll();
}