package com.ydl.mapper;

import com.ydl.entity.生产总值统计;

public interface 生产总值统计Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(生产总值统计 record);

    int insertSelective(生产总值统计 record);

    生产总值统计 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(生产总值统计 record);

    int updateByPrimaryKey(生产总值统计 record);
}