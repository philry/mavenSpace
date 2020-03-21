package aop3;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnObject, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("欢迎您"+method.getName());
    }
}
