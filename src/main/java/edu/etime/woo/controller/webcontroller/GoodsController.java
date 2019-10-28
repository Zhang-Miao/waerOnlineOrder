package edu.etime.woo.controller.webcontroller;

import edu.etime.woo.dto.GoodsDto;
import edu.etime.woo.pojo.Goods;
import edu.etime.woo.pojo.GoodsType;
import edu.etime.woo.service.impl.GoodsServiceImpl;
import edu.etime.woo.service.impl.GoodsTypeServiceImpl;
import edu.etime.woo.tools.Pagers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;


/**
 * @author: lb
 * @datetime: 2019-10-22  20:37:26
 */
@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;

    @Autowired
    private GoodsTypeServiceImpl goodsTypeServicep;

    /**
     * 进入添加页面
     * 初始化类型下拉列表，显示可用的类型
     *
     * @return
     */
    @RequestMapping("/toadd")
    public String toadd(Model model) {
        GoodsType gt = new GoodsType();
        gt.setGtstate(1);
        List<GoodsType> gtlist = goodsTypeServicep.selectList(gt);
        model.addAttribute("gtlist", gtlist);
        return "/goods/add";
    }

    /**
     * 添加信息
     *
     * @param model
     * @param goods
     * @param file
     * @return
     */
    @RequestMapping("/add")
    public String add(Model model, Goods goods, MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        //获取上传文件的后缀
        int index=filename.lastIndexOf(".");
        String suffexname=filename.substring(index);
        //用时间戳给文件命名
        String newFileName = String.valueOf(System.currentTimeMillis())+ suffexname;
        //设置保存图片的路径
        String filePath = "E:\\j2ee\\wearOnlineOrder\\img\\";
        //封装上传文件位置的全路径
        File targetFile = new File(filePath, newFileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        //将地址存进数据库
        goods.setGimg(newFileName);
        goods.setGid(UUID.randomUUID().toString());
        int i = goodsService.insert(goods);
        if (i > 0) {
            return "redirect:/goods/list";
        } else {
            model.addAttribute("msg", "添加失败");
            return "/goods/add";
        }
    }

    /**
     * 初始化修改页面
     *
     * @return
     */
    @RequestMapping("/toedit/{gid}")
    public String toedit(@PathVariable("gid") String gid, Model model) {
        Goods goods = goodsService.selectById(gid);
        if (goods != null) {
            //初始化下拉框信息
            GoodsType goodsType = new GoodsType();
            goodsType.setGtstate(1);
            List<GoodsType> gtype = goodsTypeServicep.selectList(goodsType);
            model.addAttribute("goods", goods);
            model.addAttribute("gtype", gtype);
        }
        return "/goods/edit";
    }


    /**
     * 修改页面
     *
     * @param model
     * @param goods
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Model model, Goods goods) {
        int i = goodsService.update(goods);
        if (i > 0) {
            return "redirect:/goods/list";
        } else {
            model.addAttribute("msg", "修改失败");
            return "/goods/edit";
        }
    }


    /**
     * 处理ajax编辑请求
     * 根据类型和名称进行查询，排除本身
     * 如果存在返回t，如果不存在返回f
     *
     * @param gtid
     * @param gname
     * @throws Exception
     */
    @RequestMapping("/ajaxedit")
    @ResponseBody
    public String ajaxedit(String gtid, String gname, String gid) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("gtid", gtid);
        map.put("gname", gname);
        Goods goods = goodsService.selectByGname(map);
        Goods goods1 = goodsService.selectById(gid);
        if (goods != null && goods1.getGname().equals(goods.getGname()) && gname.equals(goods1.getGname())) {
            return "f";
        } else if (goods == null) {
            return "f";
        } else {
            return "t";
        }
    }


    /**
     * 处理ajax添加请求
     * 根据类型和名称进行查询
     * 如果存在返回t，如果不存在返回f
     *
     * @param gtid
     * @param gname
     * @throws Exception
     */
    @RequestMapping("/ajaxadd")
    @ResponseBody
    public String ajaxadd(String gtid, String gname) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("gtid", gtid);
        map.put("gname", gname);
        Goods goods = goodsService.selectByGname(map);
        if (goods != null) {
            return "t";
        } else {
            return "f";
        }
    }

//    /**
//     * 初始化列表
//     * 可以进行条件查询
//     *
//     * @param model
//     * @param gdto
//     * @return
//     */
//    @RequestMapping("/list")
//    public String list(Model model, GoodsDto gdto) {
//        if (gdto != null && gdto.getGname() != null && !gdto.getGname().equals("")) {
//            gdto.setGname("%" + gdto.getGname() + "%");
//        }
//        List<GoodsDto> list = goodsService.selectList(gdto);
//        model.addAttribute("list", list);
//        return "/goods/list";
//    }



    /**
     * 初始化菜品信息列表 地址：localhost:8080/goods/list
     * 带分页的查询
     * @param model
     * @param gdto
     * @return
     */
    @RequestMapping("/list")
    public String list(Integer index, Model model, GoodsDto gdto) {
        if (index == null) {
            index = 1;
        }
        // 构建参数，加上模糊查询的通配符%
        if (gdto!= null && gdto.getGname() != null && !gdto.getGname().equals("")) {
            gdto.setGname("%" + gdto.getGname() + "%");
        }
        Pagers<GoodsDto> p = goodsService.selectListPage(gdto,index,10);
        model.addAttribute("p", p);
        return "/goods/list";
    }


}