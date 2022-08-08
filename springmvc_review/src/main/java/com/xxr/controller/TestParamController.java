package com.xxr.controller;

import com.xxr.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * ClassName TestParamController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/5 10:08
 */
@Controller
public class TestParamController {


    @RequestMapping("/sign")
    public String test1(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        if ("eric".equals(username) && "admin123".equals(pwd)) {

            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 支持reset直接往路径传参数
     * return
     */
    @RequestMapping("/sign/{username}/{pwd}")
    public String testRest(@PathVariable("username") String username, @PathVariable("pwd") String pwd) {
        if ("eric".equals(username) && "admin123".equals(pwd)) {

            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 测试 @RequestParam
     * param username
     * param pwd
     * return String
     */
    @RequestMapping("/sign/annotation")
    public String test2(
            @RequestParam(value = "name", required = false, defaultValue = "undefined") String username,
            @RequestParam("password") String pwd
    ) {

        if ("eric".equals(username) && "admin123".equals(pwd)) {

            return "success";
        } else {
            return "fail";
        }
    }


    /**
     *测试 @CookieValue @RequestHeader
     */
    @RequestMapping("/sign/cookie")
    public String test3(
            @RequestParam(value = "name", required = false, defaultValue = "undefined") String username,
            @RequestParam("password") String pwd,
            @CookieValue("JSESSIONID") String jessionid,
            @RequestHeader(value = "referer", required = true) String referer
    ) {

        System.out.println("referer:\t" + referer);
        System.out.println("jsessionid:\t" + jessionid);

        if ("eric".equals(username) && "admin123".equals(pwd)) {

            return "success";
        } else {
            return "fail";
        }
    }


    @RequestMapping("/sign/pojo")
    public String testPojoParam(User user){
        //这里的User不加@RequestBody注解是因为此处处理的是url拼接方式，?name=eric&pwd=admin123 这种格式的
        System.out.println(user);
        return "success";
    }

}
