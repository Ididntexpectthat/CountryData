package com.ydl.entity;

public class ZjIntroduce {
    private Integer gid;

    private String xjdm;

    private String qxm;

    private String zm;

    private Double centerpointx;

    private Double centerpointy;

    private String introduce;

    private String filepath;

    private String remarks;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getXjdm() {
        return xjdm;
    }

    public void setXjdm(String xjdm) {
        this.xjdm = xjdm == null ? null : xjdm.trim();
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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
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