package com.ydl.mapper;

import com.ydl.entity.EconomicData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EconomicDataMapper {
    List<EconomicData> getAllTableName(EconomicData economicData);
}
