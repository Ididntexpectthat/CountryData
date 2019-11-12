package com.ydl.entity.basicspatialdata;

import lombok.Data;

import java.util.Date;

@Data
public class ThreeDimensional {
    private Integer id;

    private String name;

    private String url;

    private String keyvalue;

    private String scenename;

    private String maplayers;

    private String layersdatatype;

    private Date updatetime;

    private Date modifytime;

    private String groupname;

    private Double centerpointx;

    private Double centerpointy;

    private Double centerpointz;

    private String remarks;

    private String srs;


}