package com.ydl.mapper.经济数据;

import com.ydl.entity.经济数据.BasicSocialSituation1_2014;

public interface BasicSocialSituation1_2014Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(BasicSocialSituation1_2014 record);

    int insertSelective(BasicSocialSituation1_2014 record);

    BasicSocialSituation1_2014 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(BasicSocialSituation1_2014 record);

    int updateByPrimaryKey(BasicSocialSituation1_2014 record);
}