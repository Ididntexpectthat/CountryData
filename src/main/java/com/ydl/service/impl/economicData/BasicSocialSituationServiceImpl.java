package com.ydl.service.impl.economicData;

import com.ydl.entity.economicData.BasicSocialSituation2_2014;
import com.ydl.entity.economicData.BasicSocialSituation2_2016;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.mapper.economicData.*;
import com.ydl.service.economicData.BasicSocialSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicSocialSituationServiceImpl implements BasicSocialSituationService {
    @Autowired
    BasicSocialSituation1_2014Mapper situation1_2014Mapper;
    @Autowired
    BasicSocialSituation2_2014Mapper situation2_2014Mapper;
    @Autowired
    BasicSocialSituation1_2015Mapper situation1_2015Mapper;
    @Autowired
    BasicSocialSituation2_2015Mapper situation2_2015Mapper;
    @Autowired
    BasicSocialSituation1_2016Mapper situation1_2016Mapper;
    @Autowired
    BasicSocialSituation2_2016Mapper situation2_2016Mapper;
    @Override
    public Object getDataByTableName(EconomicData economicData) {
        if(economicData.getTableName().equals("BasicSocialSituation1_2014")){
            return situation1_2014Mapper.getDataByTableName();
        }

        if(economicData.getTableName().equals("BasicSocialSituation2_2014")){
            return situation2_2014Mapper.getDataByTableName();
        }

        if(economicData.getTableName().equals("BasicSocialSituation1_2015")){
            return situation1_2015Mapper.getDataByTableName();
        }

        if(economicData.getTableName().equals("BasicSocialSituation2_2015")){
            return situation2_2015Mapper.getDataByTableName();
        }
        if(economicData.getTableName().equals("BasicSocialSituation1_2016")){
            return situation1_2016Mapper.getDataByTableName();
        }
        if(economicData.getTableName().equals("BasicSocialSituation2_2016")){
            return situation2_2016Mapper.getDataByTableName();
        }
        List list = new ArrayList();
        list.add("参数错误，请输入正确的数据！");
        return new ResponseEntity<Object>(list, HttpStatus.UNAUTHORIZED);
    }
}
