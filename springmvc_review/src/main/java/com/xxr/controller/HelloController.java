package com.xxr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName HelloController
 * Description TODO
 * Author Mr_X
 * Date 2022/8/4 22:37
 * Version 1.0
 */
@Controller
@RequestMapping("/test")
public class HelloController {


    /**
     * value 属性是数组类型，即当前浏览器所发送请求的请求路径匹配value属性中的任何一个值
     * method 要是无法符合条件则会报 405 - Request method 'xxx' not supported
     * <p>
     * param：表示当前所匹配请求的请求参数中必须携带param参数
     * "!param"：表示当前所匹配请求的请求参数中一定不能携带param参数
     * "param=value"：表示当前所匹配请求的请求参数中必须携带param参数且值必须为value
     * "param!=value"：表示当前所匹配请求的请求参数中可以不携带param，若携带值一定不能是value
     * <p>
     * <p>
     * return
     */
    @RequestMapping(
            value = {"/hello", "/welcome"},
            method = {RequestMethod.GET, RequestMethod.POST},
//            params = {"username","!password","age=20","gender!=male"}
            headers = {"referer"}
    )
    public String hello() {
        return "success";
    }


    /**
     * springmvc支持ant风格，类似于通配符
     * ？：表示任意的单个字符
     * *：表示任意的0个或多个字符
     * **：表示任意层数的任意目录
     * return 1231
     */
    @RequestMapping("/a?a")
    public String testAnt0() {
        return "success";
    }

    @RequestMapping("/b*b")
    public String testAnt1() {
        return "success";
    }

    @RequestMapping("/**/hello")
    public String testAnt2() {
        return "success";
    }

    /**
     * 支持reset直接往路径传参数
     * return
     */
    @RequestMapping("/login/{username}/{pwd}")
    public String testRest(@PathVariable("username") String username, @PathVariable("pwd") String pwd) {
        if ("eric".equals(username) && "admin123".equals(pwd)) {

            return "success";
        } else {
            return "fail";
        }
    }


}
