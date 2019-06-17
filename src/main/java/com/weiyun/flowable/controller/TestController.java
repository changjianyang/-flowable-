package com.weiyun.flowable.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchangjian
 * @version 1.0
 * @Description:
 * @datetime 2019/6/17 10:43
 */
@RefreshScope
@RestController
@Api(value = "flowable-swagger-测试")
@RequestMapping(value = "flowable")
public class TestController {

    @Value("${name}")
    private String name;

    @ApiOperation(value = "获取名字")
    @GetMapping(value = "getName")
    public String test() {
        return this.name;
    }
}
