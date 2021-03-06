package com.ydl.api;

import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.Introduce;
import com.ydl.entity.ZjIntroduce;
import com.ydl.mapper.IntroduceMapper;
import com.ydl.mapper.ZjIntroduceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 地图搜索模块
 */
@RestController
@RequestMapping("/MapSearch")
public class MapSearch {
    @Autowired
    IntroduceMapper introduceMapper;
    @Autowired
    ZjIntroduceMapper zjIntroduceMapper;

    @PostMapping(value = "getQxm")
    public Object getQxm(@RequestBody Map<String,Object> models) throws Exception {
        return introduceMapper.getQxm();
    }

    @PostMapping(value = "getZmAndCmByQxm")
    public Object getAllZmAndCm(@RequestBody Map<String,Object> models) throws Exception {
        Introduce introduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("Introduce"),Introduce.class);
        return introduceMapper.getZmAndCmByQxm(introduce);
    }

    @PostMapping(value = "getCmMessage")
    public Object getCmMessage(@RequestBody Map<String,Object> models) throws Exception {
        Introduce introduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("Introduce"),Introduce.class);

        return introduceMapper.getCmMessage(introduce);
    }

    @PostMapping(value = "getZmMessage")
    public Object getZmMessage(@RequestBody Map<String,Object> models) throws Exception {
        ZjIntroduce zjIntroduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("ZjIntroduce"),ZjIntroduce.class);

        return zjIntroduceMapper.getZmMessage(zjIntroduce);
    }

    @PostMapping(value = "getAllCm")
    public Object getAllCm(@RequestBody Map<String,Object> models) throws Exception {
        Introduce introduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("Introduce"),Introduce.class);

        return introduceMapper.getAllCm(introduce);
    }

    @PostMapping(value = "updateCmByxzqdm")
    public Object updateCmByxzqdm(@RequestBody Map<String,Object> models) throws Exception {
        Introduce introduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("Introduce"),Introduce.class);

        return introduceMapper.updateCmByxzqdm(introduce);
    }

    @PostMapping(value = "updateZmByzm")
    public Object updateZmByzm(@RequestBody Map<String,Object> models) throws Exception {
        ZjIntroduce zjIntroduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("ZjIntroduce"),ZjIntroduce.class);
//        zjIntroduceMapper.updateZmByzm(zjIntroduce);
//        introduceMapper.updateCmByZm(zjIntroduce,introduce.getZm());
        return zjIntroduceMapper.updateZmByzm(zjIntroduce);
    }

//    @PostMapping(value = "updateZmByGid")
//    public Object updateZmByGid(@RequestBody Map<String,Object> models) throws Exception {
//        ZjIntroduce zjIntroduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("ZjIntroduce"),ZjIntroduce.class);
//
//        return zjIntroduceMapper.updateZmByzm(zjIntroduce);
//    }
}
