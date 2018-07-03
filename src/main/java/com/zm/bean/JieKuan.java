package com.zm.bean;

import java.io.Serializable;
import java.util.Date;

public class JieKuan implements Serializable {

    private static final long serialVersionUID = -1383878307962325433L;
    private Integer t_jid;
    private Integer userid;
    private Date t_jdate;
    private Date t_hdate;
    private Double t_jprice;
    private Double t_lixi;
    private Integer status;
    private Integer t_jtype;
    private String  uzhenname;


    public Integer getT_jid() {
        return t_jid;
    }

    public void setT_jid(Integer t_jid) {
        this.t_jid = t_jid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getT_jdate() {
        return t_jdate;
    }

    public void setT_jdate(Date t_jdate) {
        this.t_jdate = t_jdate;
    }

    public Date getT_hdate() {
        return t_hdate;
    }

    public void setT_hdate(Date t_hdate) {
        this.t_hdate = t_hdate;
    }

    public Double getT_jprice() {
        return t_jprice;
    }

    public void setT_jprice(Double t_jprice) {
        this.t_jprice = t_jprice;
    }

    public Double getT_lixi() {
        return t_lixi;
    }

    public void setT_lixi(Double t_lixi) {
        this.t_lixi = t_lixi;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getT_jtype() {
        return t_jtype;
    }

    public void setT_jtype(Integer t_jtype) {
        this.t_jtype = t_jtype;
    }

    public String getUzhenname() {
        return uzhenname;
    }

    public void setUzhenname(String uzhenname) {
        this.uzhenname = uzhenname;
    }

    @Override
    public String toString() {
        return "JieKuan{" +
                "t_jid=" + t_jid +
                ", userid=" + userid +
                ", t_jdate='" + t_jdate + '\'' +
                ", t_hdate='" + t_hdate + '\'' +
                ", t_jprice=" + t_jprice +
                ", t_lixi=" + t_lixi +
                ", status=" + status +
                ", t_jtype=" + t_jtype +
                ", uzhenname='" + uzhenname + '\'' +
                '}';
    }
}
