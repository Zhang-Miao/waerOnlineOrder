package edu.etime.woo.service.impl;

import edu.etime.woo.dao.GoodsMapper;
import edu.etime.woo.dto.GoodsDto;
import edu.etime.woo.pojo.Goods;
import edu.etime.woo.service.interfaces.GoodsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜品信息服务层实现
 * @author: lb
 * @datetime: 2019-10-22  20:46:41
 */
@Service
public class GoodsServices implements GoodsInterface{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsDto> selectList(GoodsDto gdto) {
        return goodsMapper.selectList(gdto);
    }
}
