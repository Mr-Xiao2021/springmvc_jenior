package com.xxr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName TestRestController
 * 查询所有的用户信息-->/user-->get
 * 根据id查询用户信息-->/user/1-->get
 * 添加用户信息-->/user-->post
 * 修改用户信息-->/user-->put
 * 删除用户信息-->/user/1-->delete
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/5 23:19
 */
@Controller
public class TestRestController {

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("select * from user");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("待删除的用户id为："+id);
        return "success";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser(){
        System.out.println("添加用户信息-->/user-->post");
        return "success";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息-->/user-->put");
        return "success";
    }

    //@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息-->/user/"+id+"-->delete");
        return "success";
    }

    @RequestMapping("/restfulpage")
    public String getRestfulPage(){
        return "Restful";
    }


}
