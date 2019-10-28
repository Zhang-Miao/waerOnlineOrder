package edu.etime.woo.service.impl;

import edu.etime.woo.dao.SysUserMapper;
import edu.etime.woo.pojo.SysFun;
import edu.etime.woo.pojo.SysUser;
import edu.etime.woo.service.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInterface{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserByUserName(SysUser user) {
        return this.sysUserMapper.selectUserByUserName(user);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    //根据用户的角色Id查询功能列表
    @Override
    public List<SysFun> selectFunByRoleId(String roleid) {
        return sysUserMapper.selectFunByRoleId(roleid);
    }


}
