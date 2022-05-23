package com.imust.fashion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author xwk_start
 * @Date 2022/5/3 15:51
 * @Description
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class FashionApplication {
    public static void main(String[] args) {
        SpringApplication.run(FashionApplication.class, args);
        log.info("项目启动成功...");
    }
}
