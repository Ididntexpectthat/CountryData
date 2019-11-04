package com.ydl.api;

import com.alibaba.fastjson.JSONObject;
import com.ydl.entity.EconomicData;
import com.ydl.service.EconomicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("EconomicData")
public class EconomicDataApi {
    @Autowired
    EconomicDataService economicDataService;
    @PostMapping("/classification")
    public Object getAllDepartment(@RequestBody EconomicData economicData) {
        return new ResponseEntity<List>(economicDataService.getAllTableName(economicData), HttpStatus.OK);
    }
    //    @UserLoginToken
//    @PostMapping(value = "/subRegion")
//    public Object classification(@RequestBody EconomicData economicData) {
//        JSONObject jsonObject = new JSONObject();
//        List<EconomicData> economicDataList = economicDataService.getAllTableName(economicData);
//        List list = new ArrayList();
//
//        for(EconomicData economicData1 : economicDataList){
////            System.out.println(economicData1.getTableName().substring(5,8));
//            list.add(economicData1.getTableName().substring(5,8));
//        }
//        jsonObject.put("economicDataList",economicDataList);
//        jsonObject.put("list",list);
//        return jsonObject;
//    }
    @PostMapping(value = "/subRegion")
    public Object classification(@RequestBody EconomicData economicData) {
        JSONObject jsonObject = new JSONObject();
        List<String> list = economicDataService.getAllTableName(economicData);
        List<String> list1 = new ArrayList();

        for(String economicData1 : list){
//            System.out.println(economicData1.getTableName().substring(5,8));
            list1.add(economicData1.substring(5,8));
        }
        jsonObject.put("tableName",list);
        jsonObject.put("list",list1);
        return jsonObject;
    }
}
