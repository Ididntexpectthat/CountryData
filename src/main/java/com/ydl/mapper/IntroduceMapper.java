package com.ydl.mapper;

import com.ydl.entity.Introduce;

import java.util.List;
import java.util.Map;

public interface IntroduceMapper {
    //    int deleteByPrimaryKey(String xzqdm);
//
//    int insert(Introduce record);
//
//    int insertSelective(Introduce record);
//
//    Introduce selectByPrimaryKey(String xzqdm);
//
//    int updateByPrimaryKeySelective(Introduce record);
//
//    int updateByPrimaryKey(Introduce record);
    List<Map> getZmAndCmByQxm(Introduce introduce);

    Map getCmMessage(Introduce introduce);

    List<Map> getQxm();
}