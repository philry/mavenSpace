package global;

import controller.SomeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 13:30
 * Description:
 * version:1.0
 */
//此时必须配置<mvc:annotation-driven></mvc:annotation-driven>
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(SomeException.class)
    public String exceptionHandler(Exception e){
        System.out.println("正在执行全局异常处理");
        return "globalException";
    }

}
