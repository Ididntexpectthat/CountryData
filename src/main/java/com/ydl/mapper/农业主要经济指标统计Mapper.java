package com.ydl.mapper;

import com.ydl.entity.农业主要经济指标统计;

public interface 农业主要经济指标统计Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(农业主要经济指标统计 record);

    int insertSelective(农业主要经济指标统计 record);

    农业主要经济指标统计 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(农业主要经济指标统计 record);

    int updateByPrimaryKey(农业主要经济指标统计 record);
}