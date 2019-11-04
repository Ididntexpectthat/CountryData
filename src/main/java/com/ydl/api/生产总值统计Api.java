package com.ydl.api;

import com.alibaba.fastjson.JSONObject;
import com.ydl.annotation.UserLoginToken;
import com.ydl.entity.DemographicData;
import com.ydl.entity.EconomicData;
import com.ydl.entity.生产总值统计;
import com.ydl.service.EconomicDataService;
import com.ydl.service.GrossProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/GrossProduct")
public class 生产总值统计Api {
    @Autowired
    EconomicDataService economicDataService;
    @Autowired
    GrossProductService grossProductService;


//    @PostMapping(value = "/getDataByTableName")
//    public Object data(@RequestBody 生产总值统计 grossProduct) {
//        System.out.println(grossProduct.getTableName());
//     return grossProductService.getDataByTableName(grossProduct);
//    }
@PostMapping(value = "/getDataByTableName")
public Object data(@RequestBody EconomicData economicData) {
    System.out.println(economicData.getTableName());
    return grossProductService.getDataByTableName(economicData);
}
}
