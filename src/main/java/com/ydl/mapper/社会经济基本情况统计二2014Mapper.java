package com.ydl.mapper;

import com.ydl.entity.社会经济基本情况统计二2014;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface 社会经济基本情况统计二2014Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(社会经济基本情况统计二2014 record);

    int insertSelective(社会经济基本情况统计二2014 record);

    社会经济基本情况统计二2014 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(社会经济基本情况统计二2014 record);

    int updateByPrimaryKey(社会经济基本情况统计二2014 record);
}