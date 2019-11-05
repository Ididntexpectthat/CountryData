package com.ydl.service.impl;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.RuralPerCapitaNetIncome;
import com.ydl.mapper.RuralPerCapitaNetIncomeMapper;
import com.ydl.service.RuralPerCapitaNetIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuralPerCapitaNetIncomeServiceImpl implements RuralPerCapitaNetIncomeService {
    @Autowired
    RuralPerCapitaNetIncomeMapper rural;
    @Override
    public List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData) {
        return rural.getDataByTableName(economicData);
    }
}
