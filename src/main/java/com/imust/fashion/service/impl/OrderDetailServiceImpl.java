package com.imust.fashion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imust.fashion.entity.OrderDetail;
import com.imust.fashion.mapper.OrderDetailMapper;
import com.imust.fashion.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}