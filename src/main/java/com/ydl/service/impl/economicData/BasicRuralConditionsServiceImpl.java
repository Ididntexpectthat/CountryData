package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.BasicRuralConditions;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.mapper.economicData.BasicRuralConditionsMapper;
import com.ydl.service.economicData.BasicRuralConditionsService;
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
