package com.imust.fashion.common;

/**
 * @Author xwk_start
 * @Date 2022/5/18 15:21
 * @Description 自定义业务异常
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
