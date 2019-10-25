package edu.etime.woo.service.interfaces;

import edu.etime.woo.dto.GoodsDto;
import edu.etime.woo.pojo.Goods;

import java.util.List;

/**
 * 菜品信息服务层接口
 * @author: lb
 * @datetime: 2019-10-22  20:43:29
 * 菜品信息服务层接口
 */
public interface GoodsInterface {
    List<GoodsDto> selectList(GoodsDto gdto);
}
