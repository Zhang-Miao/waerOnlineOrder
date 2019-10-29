package edu.etime.woo.dao;

import edu.etime.woo.pojo.SysRoleFun;
import org.springframework.stereotype.Component;


@Component
public interface SysRoleFunMapper {
    int deleteByPrimaryKey(String rolefunid);

    int insert(SysRoleFun record);

    int insertSelective(SysRoleFun record);

    SysRoleFun selectByPrimaryKey(String rolefunid);

    int updateByPrimaryKeySelective(SysRoleFun record);

    int updateByPrimaryKey(SysRoleFun record);
}