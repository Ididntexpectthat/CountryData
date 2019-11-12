package com.ydl.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LayerInfo {
    private Integer gid;

    private String yddm;

    private String yddmNew;

    private String ydmc;

    private String ssqy;

    private BigDecimal mj;

    private String sjly;

    private Date clsj;

    private String bz;

    private BigDecimal shapeLeng;

    private BigDecimal shapeArea;

    private Object geom;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getYddm() {
        return yddm;
    }

    public void setYddm(String yddm) {
        this.yddm = yddm == null ? null : yddm.trim();
    }

    public String getYddmNew() {
        return yddmNew;
    }

    public void setYddmNew(String yddmNew) {
        this.yddmNew = yddmNew == null ? null : yddmNew.trim();
    }

    public String getYdmc() {
        return ydmc;
    }

    public void setYdmc(String ydmc) {
        this.ydmc = ydmc == null ? null : ydmc.trim();
    }

    public String getSsqy() {
        return ssqy;
    }

    public void setSsqy(String ssqy) {
        this.ssqy = ssqy == null ? null : ssqy.trim();
    }

    public BigDecimal getMj() {
        return mj;
    }

    public void setMj(BigDecimal mj) {
        this.mj = mj;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly == null ? null : sjly.trim();
    }

    public Date getClsj() {
        return clsj;
    }

    public void setClsj(Date clsj) {
        this.clsj = clsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public BigDecimal getShapeLeng() {
        return shapeLeng;
    }

    public void setShapeLeng(BigDecimal shapeLeng) {
        this.shapeLeng = shapeLeng;
    }

    public BigDecimal getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(BigDecimal shapeArea) {
        this.shapeArea = shapeArea;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }
}