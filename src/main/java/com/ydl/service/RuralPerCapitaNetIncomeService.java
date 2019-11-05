package com.ydl.service;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.RuralPerCapitaNetIncome;

import java.util.List;

public interface RuralPerCapitaNetIncomeService {
    List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData);
}
