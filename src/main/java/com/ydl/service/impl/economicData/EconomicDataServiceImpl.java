package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.mapper.economicData.EconomicDataMapper;
import com.ydl.service.economicData.EconomicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomicDataServiceImpl implements EconomicDataService {
    @Autowired
    EconomicDataMapper economicDataMapper;
    @Override
    public List<EconomicData> getAllTableName(EconomicData economicData) {
        return economicDataMapper.getAllTableName(economicData);
    }
//@Override
//public List getAllTableName(EconomicData economicData) {
//    return economicDataMapper.getAllTableName(economicData);
//}
}
