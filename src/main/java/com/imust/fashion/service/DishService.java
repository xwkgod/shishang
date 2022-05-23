package com.imust.fashion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imust.fashion.dto.DishDto;
import com.imust.fashion.entity.Dish;

import java.util.List;

/**
 * @Author xwk_start
 * @Date 2022/5/18 14:28
 * @Description
 */
public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish, dishFlavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息同时更新口味信息
    public void updateWithFlavor(DishDto dishDto);

    //根据传过来的id批量或者是单个的删除菜品
    public void deleteByIds(List<Long> ids);
}
