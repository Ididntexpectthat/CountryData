package com.ydl.service.impl.demograhicData;

import com.ydl.entity.demographicData.DemographicData;
import com.ydl.mapper.demographicData.DemographicDataMapper;
import com.ydl.service.demograhicData.DemographicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemographicDataServiceImpl implements DemographicDataService {
    @Autowired
    DemographicDataMapper demographicDataMapper;
//    @Override
//    public Integer sum(DemographicData demographicData) {
//        return demographicDataMapper.sum(demographicData);
//    }

    @Override
    public List<DemographicData> getAllDemograhicData() {
        return demographicDataMapper.getAllDemograhicData();
    }

    @Override
    public List<DemographicData> getAllSelective(DemographicData record) {
        return demographicDataMapper.getAllSelective(record);
    }
}
