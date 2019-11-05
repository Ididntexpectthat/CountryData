package com.ydl.api.EconomicData;

import com.ydl.mapper.经济数据.BasicSocialSituation1_2014Mapper;
import com.ydl.mapper.经济数据.BasicSocialSituation2_2014Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BasicSocialSituation2_2014")
public class BasicSocialSituation2_2014Api {
    @Autowired
    BasicSocialSituation2_2014Mapper mapper;
    @PostMapping(value = "/getAll")
    public Object data() {
        return mapper.getAll();
    }
}
