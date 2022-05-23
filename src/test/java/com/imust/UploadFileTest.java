package com.imust;

import org.junit.jupiter.api.Test;

/**
 * @Author xwk_start
 * @Date 2022/5/19 20:15
 * @Description
 */
public class UploadFileTest {
    @Test
    public void test1(){

        String fileName= "xunwenkuo.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
