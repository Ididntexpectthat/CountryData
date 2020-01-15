package com.ydl.mapper;

import com.ydl.entity.ZjIntroduce;

import java.util.LinkedHashMap;
import java.util.Map;

public interface ZjIntroduceMapper {
    //    int insert(ZjIntroduce record);
//
//    int insertSelective(ZjIntroduce record);
    LinkedHashMap getZmMessage(ZjIntroduce zjIntroduce);

    int updateZmByzm(ZjIntroduce zjIntroduce);
}