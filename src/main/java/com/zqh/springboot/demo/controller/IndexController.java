package com.zqh.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangqinghua
 * @email: qinghua.zhang@topevery.net
 * @date: 2020/7/1 11:13 上午
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping
    public String index() {
        return "这是index接口";
    }


}
