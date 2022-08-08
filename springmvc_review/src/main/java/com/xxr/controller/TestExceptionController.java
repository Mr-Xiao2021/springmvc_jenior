package com.xxr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName TestExceptionController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/6 23:43
 */
@Controller
public class TestExceptionController {
    /**
     * 通过xml格式配置异常处理器
     *
     */
    @RequestMapping("/exception/hello")
    public String testHello(){
        System.out.println(1/0);
        return "success";
    }


}
