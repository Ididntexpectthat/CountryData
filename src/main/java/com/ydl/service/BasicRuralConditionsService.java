package com.ydl.service;

import com.ydl.entity.BasicRuralConditions;
import com.ydl.entity.EconomicData;
import com.ydl.entity.RuralPerCapitaNetIncome;

import java.util.List;

public interface BasicRuralConditionsService {
    List<BasicRuralConditions> getDataByTableName(EconomicData economicData);
}
