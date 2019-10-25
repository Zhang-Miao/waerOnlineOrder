package edu.etime.woo.dao;

import edu.etime.woo.pojo.GoodsType;
import org.springframework.stereotype.Component;

@Component
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(String gtid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(String gtid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

}