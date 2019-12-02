package com.ydl.mapper;

import com.ydl.entity.ZjIntroduce;

import java.util.Map;

public interface ZjIntroduceMapper {
//    int insert(ZjIntroduce record);
//
//    int insertSelective(ZjIntroduce record);
    Map getZmMessage(ZjIntroduce zjIntroduce);
}