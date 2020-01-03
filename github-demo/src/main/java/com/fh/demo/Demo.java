package com.fh.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("demo")
    public String demo(){
        return "张毅恒我是你爹!!!你是我儿!!!";
    }

    @RequestMapping("test")
    public String test(){
        return "万世祥我是你爹!!!你是我儿!!!";
    }
}
