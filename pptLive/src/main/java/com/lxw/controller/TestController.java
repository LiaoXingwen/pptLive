package com.lxw.controller;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lxw on 2017/7/25.
 */
@RestController
public class TestController {

    @Resource(name = "redisTemplate")
    ValueOperations<String , String> stringValueOperations ;
    @RequestMapping("save")
    @ResponseBody
    public String save(String key , String value){
        stringValueOperations.set(key,value);
        return "success" ;
    }
    @RequestMapping("get")
    @ResponseBody
    public String get(String key ){
        return  stringValueOperations.get(key) ;
    }
}
