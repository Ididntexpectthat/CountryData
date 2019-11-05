package com.ydl.service.demograhicData;

import com.ydl.entity.demographicData.DemographicData;

import java.util.List;

public interface DemographicDataService {

//    Integer sum(DemographicData demographicData);
    List<DemographicData> getAllDemograhicData();

    List<DemographicData> getAllSelective(DemographicData record);
}
