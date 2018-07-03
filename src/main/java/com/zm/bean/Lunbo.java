package com.zm.bean;

import java.io.Serializable;

/**
 * @program: Builddream-zb
 * @description: ${description}
 * @author: zb
 * @create: 2018-06-22 11:34
 **/
public class Lunbo implements Serializable {

    private Integer lbid;
    private String lbname;
    private String lbimage;
    private String lbriqi;
    private Integer lbstatus;

    public Integer getLbid() {
        return lbid;
    }

    public void setLbid(Integer lbid) {
        this.lbid = lbid;
    }

    public String getLbname() {
        return lbname;
    }

    public void setLbname(String lbname) {
        this.lbname = lbname;
    }

    public String getLbimage() {
        return lbimage;
    }

    public void setLbimage(String lbimage) {
        this.lbimage = lbimage;
    }

    public String getLbriqi() {
        return lbriqi;
    }

    public void setLbriqi(String lbriqi) {
        this.lbriqi = lbriqi;
    }

    public Integer getLbstatus() {
        return lbstatus;
    }

    public void setLbstatus(Integer lbstatus) {
        this.lbstatus = lbstatus;
    }

    @Override
    public String toString() {
        return "Lunbo{" +
                "lbid=" + lbid +
                ", lbname='" + lbname + '\'' +
                ", lbimage='" + lbimage + '\'' +
                ", lbriqi='" + lbriqi + '\'' +
                ", lbstatus=" + lbstatus +
                '}';
    }


}
