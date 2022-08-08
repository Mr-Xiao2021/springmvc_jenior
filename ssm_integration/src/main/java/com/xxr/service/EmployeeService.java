package com.xxr.service;

import com.github.pagehelper.PageInfo;
import com.xxr.pojo.Employee;

import java.util.List;

/**
 * Description  TODO
 * Author Mr_X
 * Date 2022/8/8 10:05
 * Version 1.0
 */
public interface EmployeeService {
    List<Employee> getAllEmployee();
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
