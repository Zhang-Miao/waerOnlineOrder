package edu.etime.woo.controller;


import edu.etime.woo.pojo.SysUser;
import edu.etime.woo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

//import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {

    @Autowired
    private  UserService userService;


    @RequestMapping("/login")
    public String login(SysUser user, HttpSession session, Model m) {

         user = userService.findUserByUserName(user);
//        System.out.print(user);
        if (user == null) {
            //m.addAttribute("msg", "用户名或密码错误");
            return "/login";
        } else {
            session.setAttribute("LOGIN_USER", user);
            return "/test";
        }
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "/login";
    }



//    @RequestMapping("logout")
//    public String logout(HttpSession session){
//        session.invalidate();
//        return "redirect:/login.html";
//    }
}
