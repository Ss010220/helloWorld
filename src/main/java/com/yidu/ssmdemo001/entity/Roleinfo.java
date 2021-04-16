package com.yidu.ssmdemo001.entity;

import org.springframework.stereotype.Component;

@Component
public class Roleinfo {

    private int roleid;
    private String rolename;

    public Roleinfo() {
    }

    public Roleinfo(int roleid, String rolename) {
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Roleinfo{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
