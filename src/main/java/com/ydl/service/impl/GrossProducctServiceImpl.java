package com.ydl.service.impl;

import com.ydl.entity.EconomicData;
import com.ydl.entity.生产总值统计;
import com.ydl.mapper.生产总值统计Mapper;
import com.ydl.service.GrossProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrossProducctServiceImpl implements GrossProductService {
    @Autowired
    生产总值统计Mapper grossProductMapper;
//    @Override
//    public List<生产总值统计> getDataByTableName(生产总值统计 grossProduct) {
//        return grossProductMapper.getDataByTableName(grossProduct);
//    }

    @Override
    public List<生产总值统计> getDataByTableName(EconomicData economicData) {
        return grossProductMapper.getDataByTableName(economicData);
    }
}
