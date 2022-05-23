package com.imust.fashion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imust.fashion.entity.ShoppingCart;

/**
 * @Author xwk_start
 * @Date 2022/5/22 15:33
 * @Description
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    void clean();
}
