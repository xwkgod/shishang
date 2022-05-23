package com.imust.fashion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imust.fashion.entity.Category;

/**
 * @Author xwk_start
 * @Date 2022/5/18 10:29
 * @Description
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
