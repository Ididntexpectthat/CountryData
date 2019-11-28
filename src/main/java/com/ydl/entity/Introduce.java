package com.ydl.entity;

public class Introduce {
    private String xzqdm;

    private Integer gid;

    private String xzqmc;

    private String qxm;

    private String zm;

    private String introduce;

    private Double centerpointx;

    private Double centerpointy;

    private String filepath;

    private String remarks;

    public String getXzqdm() {
        return xzqdm;
    }

    public void setXzqdm(String xzqdm) {
        this.xzqdm = xzqdm == null ? null : xzqdm.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getXzqmc() {
        return xzqmc;
    }

    public void setXzqmc(String xzqmc) {
        this.xzqmc = xzqmc == null ? null : xzqmc.trim();
    }

    public String getQxm() {
        return qxm;
    }

    public void setQxm(String qxm) {
        this.qxm = qxm == null ? null : qxm.trim();
    }

    public String getZm() {
        return zm;
    }

    public void setZm(String zm) {
        this.zm = zm == null ? null : zm.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Double getCenterpointx() {
        return centerpointx;
    }

    public void setCenterpointx(Double centerpointx) {
        this.centerpointx = centerpointx;
    }

    public Double getCenterpointy() {
        return centerpointy;
    }

    public void setCenterpointy(Double centerpointy) {
        this.centerpointy = centerpointy;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}