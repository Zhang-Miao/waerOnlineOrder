package edu.etime.woo.controller.webcontroller;

import edu.etime.woo.dto.GoodsDto;
import edu.etime.woo.service.impl.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: lb
 * @datetime: 2019-10-22  20:37:26
 */
@Controller
@RequestMapping("manage/goods")
public class GoodsController{

    @Autowired
    private GoodsServices gservices;


    /**
     * 初始化菜品信息列表 地址：localhost:8080/manage/goods/list
     *
     * @param model
     * @param gdto
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model, GoodsDto gdto) {
        List<GoodsDto> list = gservices.selectList(gdto);
        model.addAttribute("list", list);
        return "/goods/list";
    }

    @RequestMapping("/add")
    public String add() {
        return "/goods/add";
    }


}