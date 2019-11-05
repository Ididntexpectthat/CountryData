package com.ydl.mapper.economicData;

import com.ydl.entity.economicData.EconomicData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("EconomicDataMapper")
public interface EconomicDataMapper {
    List<EconomicData> getAllTableName(EconomicData economicData);
}
