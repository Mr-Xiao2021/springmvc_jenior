package com.xxr.mapper;

import com.xxr.pojo.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description  TODO
 * Author Mr_X
 * Date 2022/8/8 10:49
 * Version 1.0
 */
public interface EmployeeMapper {


    List<Employee> getAllEmployee();
}
