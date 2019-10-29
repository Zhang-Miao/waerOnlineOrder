package edu.etime.woo.service.interfaces;

import edu.etime.woo.pojo.SysFun;
import edu.etime.woo.pojo.SysUser;

import java.util.List;

public interface UserInterface {

    SysUser findUserByUserName(SysUser user);

    List<SysUser> findAll();

    //根据用户的角色Id查询功能列表
    List<SysFun> selectFunByRoleId(String roleid);
}
