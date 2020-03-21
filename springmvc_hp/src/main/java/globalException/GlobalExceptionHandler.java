package globalException;

import controller.SomeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SomeException.class)
    public String exceptionHandler (Exception e){
        System.out.println("正在执行全局异常");
        return "globalException";
    }
}
