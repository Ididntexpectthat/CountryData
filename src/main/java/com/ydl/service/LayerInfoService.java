package com.ydl.service;

import com.ydl.entity.LayerInfoUtil;


import java.util.List;
import java.util.Map;

public interface LayerInfoService {
//    JSONArray getLayerInfo(LayerInfoUtil layerInfoUtil) throws Exception;
    List<Map> getLayerInfo(LayerInfoUtil layerInfoUtil) throws Exception;
}
