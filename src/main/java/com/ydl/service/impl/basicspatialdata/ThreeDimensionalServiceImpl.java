package com.ydl.service.impl.basicspatialdata;

import com.ydl.entity.basicspatialdata.ThreeDimensional;
import com.ydl.mapper.basicspatialdata.ThreeDimensionalMapper;
import com.ydl.service.ThreeDimensionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreeDimensionalServiceImpl implements ThreeDimensionalService {
    @Autowired
    ThreeDimensionalMapper threeDimensionalMapper;
    @Override
    public ThreeDimensional getThreeDimensional(ThreeDimensional threeDimensional) {
        return threeDimensionalMapper.getThreeDimensional(threeDimensional);
    }
}
