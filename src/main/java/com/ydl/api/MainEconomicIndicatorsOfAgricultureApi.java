package com.ydl.api;

import com.ydl.entity.EconomicData;
import com.ydl.mapper.农业主要经济指标Mapper;
import com.ydl.service.MainEconomicIndicatorsOfAgricultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MainEconomicIndicatorsOfAgriculture")
public class MainEconomicIndicatorsOfAgricultureApi {
    @Autowired
    MainEconomicIndicatorsOfAgricultureService mainEconomicIndicatorsOfAgricultureService;
    @PostMapping(value = "/getDataByTableName")
    public Object data(@RequestBody EconomicData economicData) {
        System.out.println(economicData.getTableName());
        return mainEconomicIndicatorsOfAgricultureService.getDataByTableName(economicData);
    }
}
