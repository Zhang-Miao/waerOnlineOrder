package edu.etime.woo.dao;

import edu.etime.woo.pojo.SysUser;
import org.springframework.stereotype.Component;


@Component
public interface SysUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}