package com.ydl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("LayerInfoMapper")
public interface LayerInfoMapper {
//    int deleteByPrimaryKey(Integer gid);
//
//    int insert(LayerInfo record);
//
//    int insertSelective(LayerInfo record);
//
//    LayerInfo selectByPrimaryKey(Integer gid);
//
//    int updateByPrimaryKeySelective(LayerInfo record);
//
//    int updateByPrimaryKey(LayerInfo record);

//    List<Object> getLayerInfo(LayerInfoUtil layerInfoUtil);

    List<Object> getLayerInfo(String tableName, String point, String type);
}