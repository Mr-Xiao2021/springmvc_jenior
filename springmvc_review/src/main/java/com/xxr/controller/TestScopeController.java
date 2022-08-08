package com.xxr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * ClassName TestScopeController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/5 16:45
 */
@Controller
@RequestMapping("/scope")
public class TestScopeController {

    /**
     * 往请求域共享数据，以下的都是转发
     * return
     */

    @RequestMapping("mav")
    public ModelAndView testMav(){

        ModelAndView mav = new ModelAndView();

        //向请求域中共享数据
        mav.addObject("testRequestScope","hello ModelAndView");
        //设置逻辑视图
        mav.setViewName("success");

        return mav;
    }



    @RequestMapping("/model")
    public String testModel(Model model){
        //org.springframework.validation.support.BindingAwareModelMap
        System.out.println(model.getClass().getName());

        model.addAttribute("testRequestScope","hello model");
        return "success";
    }

    @RequestMapping("/modelmap")
    public String testModelMap(ModelMap modelMap){
        //org.springframework.validation.support.BindingAwareModelMap
        System.out.println(modelMap.getClass().getName());

        modelMap.addAttribute("testRequestScope","hello modelMap");
        return "success";
    }

    @RequestMapping("/map")
    public String testMap(Map<String, Object> map){
        //org.springframework.validation.support.BindingAwareModelMap
        System.out.println(map.getClass().getName());

        map.put("testRequestScope","hello map");
        return "success";
    }


    @RequestMapping("/session")
    public String testSession(HttpSession session){
        //一次会话范围，即浏览器一次打开使用范围，关闭浏览器就没有了
        session.setAttribute("testSessionScope","hello session");
        return "success";
    }

    @RequestMapping("/application")
    public String testApplication(HttpSession session){
        //服务器的一次生命范围，重启服务器就没有了
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello application");
        return "success";
    }


}
