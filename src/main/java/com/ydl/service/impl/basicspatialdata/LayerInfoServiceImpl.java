package com.ydl.service.impl.basicspatialdata;

import com.ydl.entity.basicspatialdata.LayerInfo;
import com.ydl.entity.basicspatialdata.LayerInfoUtil;
import com.ydl.mapper.basicspatialdata.LayerInfoMapper;
import com.ydl.service.basicspatialdata.LayerInfoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayerInfoServiceImpl implements LayerInfoService {
    @Autowired
    LayerInfoMapper layerInfoMapper;
    @Override
    public List<Object> getLayerInfo(LayerInfoUtil layerInfoUtil) {
        return layerInfoMapper.getLayerInfo(layerInfoUtil.getTableName(),layerInfoUtil.getPoint(),layerInfoUtil.getType());
    }
}
