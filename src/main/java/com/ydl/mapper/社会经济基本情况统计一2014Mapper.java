package com.ydl.mapper;

import com.ydl.entity.社会经济基本情况统计一2014;

public interface 社会经济基本情况统计一2014Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(社会经济基本情况统计一2014 record);

    int insertSelective(社会经济基本情况统计一2014 record);

    社会经济基本情况统计一2014 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(社会经济基本情况统计一2014 record);

    int updateByPrimaryKey(社会经济基本情况统计一2014 record);
}