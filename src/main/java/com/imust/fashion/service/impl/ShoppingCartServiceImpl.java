package com.imust.fashion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imust.fashion.entity.ShoppingCart;
import com.imust.fashion.mapper.ShoppingCartMapper;
import com.imust.fashion.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @Author xwk_start
 * @Date 2022/5/22 15:34
 * @Description
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>implements ShoppingCartService {
    @Override
    public void clean() {

    }
}
