package com.xxr.service.impl;

import com.xxr.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * ClassName HelloServiceImpl
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/7 23:26
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void introduction() {
        System.out.println("service provided by spring ioc!");
    }
}
