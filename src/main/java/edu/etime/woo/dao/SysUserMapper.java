package edu.etime.woo.dao;

import edu.etime.woo.pojo.SysFun;
import edu.etime.woo.pojo.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface SysUserMapper {
    //int deleteByPrimaryKey(String userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> findAll();

    SysUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //登录查找匹配
    SysUser selectUserByUserName(SysUser user);

    //根据用户的角色Id查询功能列表
    List<SysFun> selectFunByRoleId(String roleid);
}