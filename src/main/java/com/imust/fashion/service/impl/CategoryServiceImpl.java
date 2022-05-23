package com.imust.fashion.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imust.fashion.common.CustomException;
import com.imust.fashion.entity.Category;
import com.imust.fashion.entity.Dish;
import com.imust.fashion.entity.Setmeal;
import com.imust.fashion.mapper.CategoryMapper;
import com.imust.fashion.service.CategoryService;
import com.imust.fashion.service.DishService;
import com.imust.fashion.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xwk_start
 * @Date 2022/5/18 10:31
 * @Description
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前需要进行判断
     *
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据分
        //         //查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        //         if (count1 > 0) {
        //             //已经关联菜品，抛出一个业务异常
        //             throw new CustomException("当前分类下关联了菜品，不能删除");
        //         }类id进行查新
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        //查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据分类id进行查新
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if (count2 > 0) {
            //已经关联套餐，抛出一个业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        //正常删除
        super.removeById(id);
    }
}
