package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.BasicSocialSituation2_2014;
import com.ydl.mapper.economicData.BasicSocialSituation2_2014Mapper;
import com.ydl.service.economicData.BasicSocialSituation2_2014Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicSocialSituation2_2014ServiceImpl implements BasicSocialSituation2_2014Service {
    @Autowired
    BasicSocialSituation2_2014Mapper basicSocialSituation2_2014Mapper;
    @Override
    public List<BasicSocialSituation2_2014> getAll() {
        return basicSocialSituation2_2014Mapper.getAll();
    }
}
