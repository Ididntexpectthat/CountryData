package com.ydl.mapper.basicspatialdata;

import com.ydl.entity.basicspatialdata.ThreeDimensional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ThreeDimensionalMapper")
public interface ThreeDimensionalMapper {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(ThreeDimensional record);
//
//    int insertSelective(ThreeDimensional record);
//
//    ThreeDimensional selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(ThreeDimensional record);
//
//    int updateByPrimaryKey(ThreeDimensional record);

    ThreeDimensional getThreeDimensional(@Param("param1") ThreeDimensional threeDimensional);

    List<String> getAllNamePaging();
}