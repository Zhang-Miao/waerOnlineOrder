package edu.etime.woo.pojo;

public class SysRoleFun {
    private String rolefunid;

    private String roleid;

    private String funid;

    public String getRolefunid() {
        return rolefunid;
    }

    public void setRolefunid(String rolefunid) {
        this.rolefunid = rolefunid == null ? null : rolefunid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getFunid() {
        return funid;
    }

    public void setFunid(String funid) {
        this.funid = funid == null ? null : funid.trim();
    }
}