package edu.etime.woo.dao;

import edu.etime.woo.pojo.Customer;
import org.springframework.stereotype.Component;


@Component
public interface CustomerMapper {
    int deleteByPrimaryKey(String cusid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String cusid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}