package com.mh.entity;

public class UserWithBLOBs extends User {
    private String introduce;

    private String touxiang;

    private String idcardimg;

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang == null ? null : touxiang.trim();
    }

    public String getIdcardimg() {
        return idcardimg;
    }

    public void setIdcardimg(String idcardimg) {
        this.idcardimg = idcardimg == null ? null : idcardimg.trim();
    }
}