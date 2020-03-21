package aop03;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 15:03
 * Description:
 * version:1.0
 */
public class WelcomeAdvice implements AfterReturningAdvice {

    /**
     * 后置通知
     * @param returnObject  返回值
     * @param method    目标方法
     * @param objects   方法参数列表
     * @param target    目标类
     * @throws Throwable
     */
    public void afterReturning(Object returnObject, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("欢迎您,"+method.getName());
    }
}
