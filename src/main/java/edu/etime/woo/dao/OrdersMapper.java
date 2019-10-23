package edu.etime.woo.dao;

import edu.etime.woo.pojo.Orders;
import org.springframework.stereotype.Component;

@Component
public interface OrdersMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}