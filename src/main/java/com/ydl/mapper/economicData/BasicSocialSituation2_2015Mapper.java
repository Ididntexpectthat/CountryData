package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.BasicSocialSituation2_2015;

public interface BasicSocialSituation2_2015Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(BasicSocialSituation2_2015 record);

    int insertSelective(BasicSocialSituation2_2015 record);

    BasicSocialSituation2_2015 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(BasicSocialSituation2_2015 record);

    int updateByPrimaryKey(BasicSocialSituation2_2015 record);
}