package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.EconomicData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EconomicDataMapper {
    List<EconomicData> getAllTableName(EconomicData economicData);
}
