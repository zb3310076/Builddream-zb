package com.zm.bean;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 5350442448161831762L;
    private Integer uid;
    private String uname;
    private String upass;
    private String uzhenname;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUzhenname() {
        return uzhenname;
    }

    public void setUzhenname(String uzhenname) {
        this.uzhenname = uzhenname;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", uzhenname='" + uzhenname + '\'' +
                '}';
    }
}
