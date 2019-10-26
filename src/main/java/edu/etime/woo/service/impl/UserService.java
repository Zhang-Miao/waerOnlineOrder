package edu.etime.woo.service.impl;

import edu.etime.woo.dao.SysUserMapper;
import edu.etime.woo.pojo.SysUser;
import edu.etime.woo.service.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserByUserName(SysUser user) {
        return this.sysUserMapper.selectUserByUserName(user);
    }
}
