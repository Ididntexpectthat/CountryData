package com.ydl.api.economicData;

import com.ydl.mapper.economicData.BasicSocialSituation1_2014Mapper;
import com.ydl.service.economicData.BasicSocialSituation1_2014Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BasicSocialSituation1_2014")
public class BasicSocialSituation1_2014Api {
    @Autowired
    BasicSocialSituation1_2014Service basicSocialSituation1_2014Service;
    @PostMapping(value = "/getAll")
    public Object data() {
        return basicSocialSituation1_2014Service.getAll();
    }
}
