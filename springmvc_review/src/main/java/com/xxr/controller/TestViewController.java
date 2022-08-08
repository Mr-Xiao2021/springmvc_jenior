package com.xxr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**没有任何前缀就是ThymeleafView，有forward就是InternalResourceView，前缀是redirct就是RedirectView
 * ClassName TestViewController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/5 17:28
 */
@Controller
@RequestMapping("/view")
public class TestViewController {

    @RequestMapping("/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/forward")
    public String testInternalResourceView(){
        //不被thymeleaf渲染
        return "forward:/scope/model";
    }


    @RequestMapping("/redirect")
    public String testRedirectView(){
        //不被thymeleaf渲染
        return "redirect:/scope/model";
    }
}
