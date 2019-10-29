package edu.etime.woo.controller;

import edu.etime.woo.dao.SysUserMapper;
import edu.etime.woo.pojo.SysRole;
import edu.etime.woo.pojo.SysUser;
import edu.etime.woo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    UserService userService;

    @Autowired
    SysUserMapper sysUserMapper;

    /**
     * 初始化用户列表
     */
    @RequestMapping("findAll")
    public ModelAndView findAll() {
        List<SysUser> userInfos = userService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("userInfos", userInfos);
        mav.setViewName("user/allUser");
        return mav;
    }

    /**
     * 进入增加用户
     */
    @RequestMapping("toadd")
    public String toadd(Model m) {
        List<SysUser> list = userService.findAll();
        m.addAttribute("list", list);
        return "user/addUser";

    }

    /**
     * 增加用户
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String add(SysUser user, Model model) {
        user.setUserid(UUID.randomUUID().toString());
        int rtn = sysUserMapper.insert(user);
        System.out.println(rtn);
        if (rtn > 0) {
            return "redirect:/user/allUser";
        } else {
            model.addAttribute("msg", "增加用户失败");
            return "user/addUser";
        }

    }

    /**
     * 初始化修改用户界面
     * @param id
     * @param model
     * @return
     */
    //@RequestMapping("/toedit/{id}")
//    public String toedit(@PathVariable("id") String id, Model model){
//        SysUser user = sysUserMapper.selectByPrimaryKey(id);
//        List<SysRole> list = rservice.rolelist();
//        model.addAttribute("list", list);
//        model.addAttribute("user", user);
//        return "user/editUser";
//    }
    /**
     * 修改用户
     * @param user
     * @param model
     * @return
//     */
//    @RequestMapping("/edit")
//    public String edit(SysUser user,Model model){
//        int rtn = service.edituser(user);
//        List<SysRole> list = rservice.rolelist();
//        model.addAttribute("list", list);
//        if(rtn>0){
//            return "redirect:user/allUser";
//        }else{
//            model.addAttribute("msg", "修改角色失败");
//            return "user/editUser";
//        }
//    }




}