package edu.etime.woo.dao;

import edu.etime.woo.pojo.SysRole;
import org.springframework.stereotype.Component;


@Component
public interface SysRoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}