package com.xxr.controller;

import com.xxr.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName TestSpringIocController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/7 23:29
 */
@Controller
public class TestSpringIocController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/springioc")
    public String testSpringIoc(Model model){
        helloService.introduction();
        model.addAttribute("testSpringIoc","springioc");
        return "success";
    }
}
