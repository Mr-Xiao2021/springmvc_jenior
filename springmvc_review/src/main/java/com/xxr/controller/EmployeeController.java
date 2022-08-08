package com.xxr.controller;

import com.xxr.dao.EmployeeDao;
import com.xxr.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * ClassName EmployeeController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/6 9:34
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 列举页面
     * param model
     */
    @GetMapping("/employee")
    public String getAllEmployees(Model model) {

        Collection<Employee> employees = employeeDao.getAll();
        System.out.println(employees);
        model.addAttribute("employees", employees);
        return "employee_list";
    }


    /**
     * 添加员工
     * param employee
     *
     */
    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        employeeDao.save(employee);

        //重定向也是get请求哦~
        return "redirect:/employee";
    }

    /**
     * 根据id获得相关信息回显在update的网页
     * param id
     * param model
     *
     */
    @GetMapping("/employee/{id}")
    public String update(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        //修改完毕跳转列表页面
        return "redirect:/employee";
    }


    @DeleteMapping("/employee/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        System.out.println("delete id:\t"+id);
        return "redirect:/employee";
    }


}
