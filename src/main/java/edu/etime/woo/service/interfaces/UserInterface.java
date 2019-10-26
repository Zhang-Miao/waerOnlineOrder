package edu.etime.woo.service.interfaces;

import edu.etime.woo.pojo.SysUser;

public interface UserInterface {

    SysUser findUserByUserName(SysUser user);

}
