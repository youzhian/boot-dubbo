package com.wofang.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboServiceApplication {
    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(DubboServiceApplication.class);

    public static void main(String [] args){
        SpringApplication.run(DubboServiceApplication.class,args);
        logger.info("=================DubboService启动成功=====================");
    }
}
