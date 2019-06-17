package com.weiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangchangjian
 * @version 1.0.0
 * @Description:
 * @datetime 2019/6/17 10:13
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FlowableApp {

    public static void main(String[] args) {
        SpringApplication.run(FlowableApp.class, args);
    }
    
}
