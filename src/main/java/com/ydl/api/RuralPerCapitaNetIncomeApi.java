package com.ydl.api;

import com.ydl.entity.EconomicData;
import com.ydl.service.RuralPerCapitaNetIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("RuralPerCapitaNetIncome")
public class RuralPerCapitaNetIncomeApi {
    @Autowired
    RuralPerCapitaNetIncomeService rural;
    @PostMapping(value = "/getDataByTableName")
    public Object data(@RequestBody EconomicData economicData) {
        System.out.println(economicData.getTableName());
        return rural.getDataByTableName(economicData);
    }
}
