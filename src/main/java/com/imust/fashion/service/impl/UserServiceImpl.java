package com.imust.fashion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imust.fashion.entity.User;
import com.imust.fashion.mapper.UserMapper;
import com.imust.fashion.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author xwk_start
 * @Date 2022/5/22 8:15
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements UserService {
}
