package com.yhk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springboot01
 * @author: YHK
 * @create: 2021-10-31 21:15
 **/
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){

        return "index";
    }

}
