package com.zm.bean;

import java.io.Serializable;

public class Guanggao implements Serializable{

    private Integer gid;
    private String gname;
    private String gtype;
    private String gimage;
    private String gjianjie;
    private String griqi;
    private Integer gstatus;
    private String sendtime;


    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getGstatus() {
        return gstatus;
    }

    public void setGstatus(Integer gstatus) {
        this.gstatus = gstatus;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public String getGjianjie() {
        return gjianjie;
    }

    public void setGjianjie(String gjianjie) {
        this.gjianjie = gjianjie;
    }

    public String getGriqi() {
        return griqi;
    }

    public void setGriqi(String griqi) {
        this.griqi = griqi;
    }


    @Override
    public String toString() {
        return "Guanggao{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtype='" + gtype + '\'' +
                ", gimage='" + gimage + '\'' +
                ", gjianjie='" + gjianjie + '\'' +
                ", griqi='" + griqi + '\'' +
                ", gstatus=" + gstatus +
                ", sendtime='" + sendtime + '\'' +
                '}';
    }
}
