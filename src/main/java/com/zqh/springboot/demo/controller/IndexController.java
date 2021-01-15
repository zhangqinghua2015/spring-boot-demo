package com.zqh.springboot.demo.controller;

import com.alibaba.fastjson.JSON;
import com.zqh.springboot.demo.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: zhangqinghua
 * @email: qinghua.zhang@topevery.net
 * @date: 2020/7/1 11:13 上午
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${code.info}")
    String codeInfo;

    @Autowired
    HttpServletRequest httpServletRequest;

    @GetMapping
    public String index() {
        System.out.println("访问了index接口");
        System.out.println(codeInfo);
        return "这是index接口, " + codeInfo;
    }

    @PostMapping("/jsonFiledTest")
    @ResponseBody
    public RequestDTO jsonFiledTest(String requestDTOStr) {
        RequestDTO requestDTO = JSON.parseObject(requestDTOStr, RequestDTO.class);
        System.out.println(JSON.toJSONString(requestDTO));
        return requestDTO;
    }

}
