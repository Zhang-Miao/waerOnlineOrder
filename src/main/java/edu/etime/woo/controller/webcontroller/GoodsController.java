package edu.etime.woo.controller.webcontroller;

import edu.etime.woo.pojo.Goods;
import edu.etime.woo.service.impl.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: lb
 * @datetime: 2019-10-22  20:37:26
 */
@Controller
@RequestMapping("manage/goods")
public class GoodsController {

    @Autowired
    private GoodsServices gservices;


    /**
     * 初始化菜品信息列表 地址：localhost:8080/manage/goods/list
     * @param model
     * @param goods
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model,Goods goods){
        List<Goods> goodsList=gservices.findGoodsList(goods);
        model.addAttribute("list",goodsList);
        System.out.print(goods);
        return "/goods/list";
    }
}
