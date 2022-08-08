package com.xxr.test;

import com.xxr.service.EmployeeService;
import com.xxr.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName Solution
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/8 10:46
 */
public class Solution {

    private EmployeeService employeeService = new EmployeeServiceImpl();
    @Test
    public void test1(){
        System.out.println(employeeService);
        System.out.println(employeeService.getAllEmployee());
    }
}
