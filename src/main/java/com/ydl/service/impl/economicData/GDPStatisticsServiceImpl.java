package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.GDPStatistics;
import com.ydl.mapper.economicData.GDPStatisticsMapper;
import com.ydl.service.economicData.GDPStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GDPStatisticsServiceImpl implements GDPStatisticsService {
    @Autowired
    GDPStatisticsMapper gdpStatisticsMapper;
//    @Override
//    public List<生产总值统计> getDataByTableName(生产总值统计 grossProduct) {
//        return grossProductMapper.getDataByTableName(grossProduct);
//    }

    @Override
    public List<GDPStatistics> getDataByTableName(EconomicData economicData) {
        return gdpStatisticsMapper.getDataByTableName(economicData);
    }
}
