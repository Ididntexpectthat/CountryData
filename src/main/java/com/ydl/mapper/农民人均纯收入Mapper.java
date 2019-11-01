package com.ydl.mapper;

import com.ydl.entity.农民人均纯收入;

public interface 农民人均纯收入Mapper {
    int deleteByPrimaryKey(Integer 编号);

    int insert(农民人均纯收入 record);

    int insertSelective(农民人均纯收入 record);

    农民人均纯收入 selectByPrimaryKey(Integer 编号);

    int updateByPrimaryKeySelective(农民人均纯收入 record);

    int updateByPrimaryKey(农民人均纯收入 record);
}