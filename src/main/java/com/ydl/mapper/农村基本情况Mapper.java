package com.ydl.mapper;

import com.ydl.entity.农村基本情况;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface 农村基本情况Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(农村基本情况 record);

    int insertSelective(农村基本情况 record);

    农村基本情况 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(农村基本情况 record);

    int updateByPrimaryKey(农村基本情况 record);
}