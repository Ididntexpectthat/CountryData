package com.ydl.service.economicData;

import com.ydl.entity.economicData.BasicRuralConditions;
import com.ydl.entity.economicData.EconomicData;

import java.util.List;

public interface BasicRuralConditionsService {
    List<BasicRuralConditions> getDataByTableName(EconomicData economicData);
}
