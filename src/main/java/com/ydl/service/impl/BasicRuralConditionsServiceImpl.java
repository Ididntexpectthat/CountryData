package com.ydl.service.impl;

import com.ydl.entity.BasicRuralConditions;
import com.ydl.entity.EconomicData;
import com.ydl.mapper.BasicRuralConditionsMapper;
import com.ydl.service.BasicRuralConditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicRuralConditionsServiceImpl implements BasicRuralConditionsService {
    @Autowired
    BasicRuralConditionsMapper basicRuralConditionsMapper;
    @Override
    public List<BasicRuralConditions> getDataByTableName(EconomicData economicData) {
        return basicRuralConditionsMapper.getDataByTableName(economicData);
    }
}
