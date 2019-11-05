package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.BasicSocialSituation1_2014;
import com.ydl.mapper.economicData.BasicSocialSituation1_2014Mapper;
import com.ydl.service.economicData.BasicSocialSituation1_2014Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicSocialSituation1_2014ServiceImpl implements BasicSocialSituation1_2014Service {
    @Autowired
    BasicSocialSituation1_2014Mapper basicSocialSituation1_2014Mapper;
    @Override
    public List<BasicSocialSituation1_2014> getAll() {
        return basicSocialSituation1_2014Mapper.getAll();
    }
}
