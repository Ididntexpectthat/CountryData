package com.ydl.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ydl.entity.LayerInfoUtil;
import com.ydl.mapper.LayerInfoMapper;
import com.ydl.service.LayerInfoService;
import com.ydl.service.LayersListService;
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
    @Autowired
    LayersListService layersListService;

    @Override


//    public JSONArray getLayerInfo(LayerInfoUtil layerInfoUtil) throws Exception {
//        String dataType = layersListService.selectDataTypeByKeyValue(layerInfoUtil.getKeyValue());
////        System.out.println(dataType);
//        String[] strArr = dataType.split("\\|");
////        System.out.println(strArr.length);
//        for (String  s: strArr){
////            System.out.println(s);
//            List list = layerInfoMapper.getLayerInfo(s,layerInfoUtil.getPoint(),layerInfoUtil.getType());
////            System.out.println(list.isEmpty());
//
//            if(!list.isEmpty()){
//                JSONArray jsonArray = JSONArray.fromObject(list);
////                jsonArray.remove("geom");
////                JSONArray jsonArray = new JSONArray(list);
////                JSONArray jsonArray1 = new JSONArray();
////                System.out.println(jsonArray);
//////                for(Object o: jsonArray){
//////                    JSONObject jsonObject =(JSONObject)o;
//////                    JSONObject jsonObject1 = (JSONObject) jsonObject.remove("geom");
//////                    jsonArray1.add(jsonObject1);
//////                    return jsonArray1;
////                }
////                for(Object o : list){
////                    String obj2json = JsonXMLUtils.obj2json(o);
////                    JS
////                }
//                return jsonArray;
//            }
//
//        }
//       JSONArray jsonArray = new JSONArray();
//        jsonArray.add("没有找到");
////        map.put("message","没有找到");
//        return jsonArray;
////        List list = new ArrayList();
////        list.add("没有找到");
////        return list;
//    }

    public List<Map> getLayerInfo(LayerInfoUtil layerInfoUtil) throws Exception {
        String dataType = layersListService.selectDataTypeByKeyValue(layerInfoUtil.getKeyValue());
//        System.out.println(dataType);
        String[] strArr = dataType.split("\\|");
        System.out.println(strArr.length);
        for (String s : strArr) {
            System.out.println(s);
            List<Map> list = layerInfoMapper.getLayerInfo(s, layerInfoUtil.getPoint(), layerInfoUtil.getType());
            System.out.println(list.isEmpty());
            if (!list.isEmpty()) {
                List<Map> list2 = new ArrayList<Map>();
                for (Map map : list) {
                    System.out.println(map);
                    map.remove("geom");
                    list2.add(map);
                }
                return list2;
            }
        }
        List<Map> list1 = new ArrayList<Map>();
        Map map = new HashMap();
        map.put("message","没有找到");
        list1.add(map);
        return list1;
    }
}
