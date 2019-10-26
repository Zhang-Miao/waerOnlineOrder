package edu.etime.woo.dto;

import edu.etime.woo.pojo.SysFun;

/**
 * 系统功能拓展类，用于权限分配初始化列表
 *
 * @author：yjh
 * @date：2019/10/25 15:12
 */

public class SysFunDto extends SysFun {
    private String funid;
    private String funpid;
    private String funname;
    private String funurl;
    private Integer funstate;

    @Override
    public String toString() {
        return "SysFunDto{" +
                "funid='" + funid + '\'' +
                ", funpid='" + funpid + '\'' +
                ", funname='" + funname + '\'' +
                ", funurl='" + funurl + '\'' +
                ", funstate=" + funstate +
                '}';
    }

    @Override
    public String getFunid() {
        return funid;
    }

    @Override
    public void setFunid(String funid) {
        this.funid = funid;
    }

    @Override
    public String getFunpid() {
        return funpid;
    }

    @Override
    public void setFunpid(String funpid) {
        this.funpid = funpid;
    }

    @Override
    public String getFunname() {
        return funname;
    }

    @Override
    public void setFunname(String funname) {
        this.funname = funname;
    }

    @Override
    public String getFunurl() {
        return funurl;
    }

    @Override
    public void setFunurl(String funurl) {
        this.funurl = funurl;
    }

    @Override
    public Integer getFunstate() {
        return funstate;
    }

    @Override
    public void setFunstate(Integer funstate) {
        this.funstate = funstate;
    }
}
