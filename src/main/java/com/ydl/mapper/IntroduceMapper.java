package com.ydl.mapper;

import com.ydl.entity.Introduce;

import java.util.LinkedHashMap;
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
    List<LinkedHashMap> getZmAndCmByQxm(Introduce introduce);

    LinkedHashMap getCmMessage(Introduce introduce);

    List<LinkedHashMap> getQxm();

    List<LinkedHashMap> getAllCm(Introduce introduce);
}