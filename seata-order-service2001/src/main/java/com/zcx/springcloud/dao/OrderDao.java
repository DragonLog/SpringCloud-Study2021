package com.zcx.springcloud.dao;

import com.zcx.springcloud.domain.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {

    void create(Order order);

    void update(@Param("orderId") Long orderId, @Param("status") Integer status);

}
