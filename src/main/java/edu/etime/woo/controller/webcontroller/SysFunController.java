package edu.etime.woo.controller.webcontroller;

import edu.etime.woo.pojo.SysFun;
import edu.etime.woo.service.interfaces.SysFunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 功能管理
 *
 * @author：yjh
 * @date：2019/10/26 9:13
 */
@Controller
@RequestMapping("/SysFun")
public class SysFunController {

    @Autowired
    private SysFunService service;

    @RequestMapping("/list")
    public String list(Model model){

        //service层进一步处理，接收返回值
        List<SysFun> funlist = service.selectList();

        //model 向页面传递数据
        model.addAttribute("funlist",funlist);

        return "sys/fun/list";
    }



}
