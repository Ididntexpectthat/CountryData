package com.ydl.service.impl;

import com.ydl.entity.LayerInfoUtil;
import com.ydl.mapper.LayerInfoMapper;
import com.ydl.service.LayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LayerInfoServiceImpl implements LayerInfoService {
    @Autowired
    LayerInfoMapper layerInfoMapper;
    @Override

    public Map getLayerInfo(LayerInfoUtil layerInfoUtil) {
        String[] strArr = layerInfoUtil.getTableName().split("\\|");
        for (String  s: strArr){
            if(!layerInfoMapper.getLayerInfo(s,layerInfoUtil.getPoint(),layerInfoUtil.getType()).isEmpty()){
                Map map = layerInfoMapper.getLayerInfo(s,layerInfoUtil.getPoint(),layerInfoUtil.getType());
                //删除geom
                map.keySet().removeIf(key -> key.equals("geom"));
                return map;
            }
        }
        Map map = new HashMap<>();
        map.put("message","没有找到");
        return map;
//        List list = new ArrayList();
//        list.add("没有找到");
//        return list;
    }
}
