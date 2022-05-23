package com.imust.fashion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imust.fashion.entity.Employee;
import com.imust.fashion.mapper.EmployeeMapper;
import com.imust.fashion.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author xwk_start
 * @Date 2022/5/3 17:59
 * @Description
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
