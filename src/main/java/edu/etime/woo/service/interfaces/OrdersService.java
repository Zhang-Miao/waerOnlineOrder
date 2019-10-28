package edu.etime.woo.service.interfaces;

import edu.etime.woo.dto.OrdersDto;

import java.util.List;

/**
 * @author: lb
 * @datetime: 2019-10-28  09:26:48
 * 订单接口
 */
public interface OrdersService {

    /**
     * 查看订单
     * @param odto
     * @return
     */
     List<OrdersDto>  selectList(OrdersDto odto);
}
