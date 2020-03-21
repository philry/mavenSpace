package aop3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

public class LogAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+"方法执行时间:"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"));
    }
}
