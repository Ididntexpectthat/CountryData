package com.ydl.mapper;

import com.ydl.entity.社会经济基本情况统计表;

public interface 社会经济基本情况统计表Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(社会经济基本情况统计表 record);

    int insertSelective(社会经济基本情况统计表 record);

    社会经济基本情况统计表 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(社会经济基本情况统计表 record);

    int updateByPrimaryKey(社会经济基本情况统计表 record);
}