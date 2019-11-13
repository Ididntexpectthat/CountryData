package com.ydl.service;

import com.ydl.entity.basicspatialdata.ThreeDimensional;

import java.util.List;

public interface ThreeDimensionalService {
    ThreeDimensional getThreeDimensional(ThreeDimensional threeDimensional);

    List<String> getAllNamePaging();
}
