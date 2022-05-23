package com.imust.fashion.dto;

import com.imust.fashion.entity.OrderDetail;
import com.imust.fashion.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @Author xwk_start
 * @Date 2022/5/23 19:59
 * @Description
 */
@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
