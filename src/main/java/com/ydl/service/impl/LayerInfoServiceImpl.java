package com.ydl.service.impl;

import com.ydl.entity.LayerInfoUtil;
import com.ydl.mapper.LayerInfoMapper;
import com.ydl.service.LayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LayerInfoServiceImpl implements LayerInfoService {
    @Autowired
    LayerInfoMapper layerInfoMapper;
    @Override
    public List<Object> getLayerInfo(LayerInfoUtil layerInfoUtil) {
        String[] strArr = layerInfoUtil.getTableName().split("\\|");
        for (String  s: strArr){
            if(!layerInfoMapper.getLayerInfo(s,layerInfoUtil.getPoint(),layerInfoUtil.getType()).isEmpty()){
                return layerInfoMapper.getLayerInfo(s,layerInfoUtil.getPoint(),layerInfoUtil.getType());
            }
        }
        List list = new ArrayList();
        list.add("没有找到");
        return list;
    }
}
