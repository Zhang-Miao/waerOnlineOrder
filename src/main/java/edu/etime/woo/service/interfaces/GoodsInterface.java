package edu.etime.woo.service.interfaces;

import edu.etime.woo.pojo.Goods;

import java.util.List;

/**
 * @author: lb
 * @datetime: 2019-10-22  20:43:29
 * 菜品信息服务层接口
 */
public interface GoodsInterface {
    List<Goods> findGoodsList(Goods goods);
}
