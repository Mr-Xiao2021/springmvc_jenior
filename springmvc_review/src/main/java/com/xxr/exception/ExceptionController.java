package com.xxr.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName ExceptionController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/6 23:47
 */
@ControllerAdvice
public class ExceptionController {
    /**
     * 通过注解方式配置异常处理的组件
     * param ex model
     */
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex, Model model){
        //ex表示控制器方法所出现的异常
        model.addAttribute("ex", ex);
        return "error";
    }
}
