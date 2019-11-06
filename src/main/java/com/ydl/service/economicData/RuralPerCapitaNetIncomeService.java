package com.ydl.service.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.entity.economicData.RuralPerCapitaNetIncome;

import java.util.List;

public interface RuralPerCapitaNetIncomeService {
    List<RuralPerCapitaNetIncome> getDataByTableName(EconomicData economicData);
}
