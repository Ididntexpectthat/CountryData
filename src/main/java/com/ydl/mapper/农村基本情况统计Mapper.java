package com.ydl.mapper;

import com.ydl.entity.农村基本情况统计;

public interface 农村基本情况统计Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(农村基本情况统计 record);

    int insertSelective(农村基本情况统计 record);

    农村基本情况统计 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(农村基本情况统计 record);

    int updateByPrimaryKey(农村基本情况统计 record);
}