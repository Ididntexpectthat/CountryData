package com.ydl.service;

import com.ydl.entity.EconomicData;
import com.ydl.entity.生产总值统计;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GrossProductService {
//    List<生产总值统计> getDataByTableName(生产总值统计 grossProduct);
    List<生产总值统计> getDataByTableName(EconomicData economicData);
}
