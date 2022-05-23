package com.imust.fashion.dto;


import com.imust.fashion.entity.Setmeal;
import com.imust.fashion.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
