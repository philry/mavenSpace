package aop4;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

public class AroundAdvice {
    public Object around(ProceedingJoinPoint jp) throws Throwable{
        Object target=jp.getThis();
        String method=jp.getSignature().getName();
        Object[] args=jp.getArgs();
        Object result=null;
        System.out.println("环绕通知之前置通知");
        Long begin=System.currentTimeMillis();
        try {
            jp.proceed();
            Long end=System.currentTimeMillis();
            System.out.println("环绕通知之正常返回通知");
            System.out.println("执行目标类"+target+"中的方法"+method+"共花费了"+(end-begin)+"毫秒");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            Long end=System.currentTimeMillis();
            System.out.println("执行目标类"+target+"中的方法"+method+"共花费了"+(end-begin)+"毫秒");
        }
        return result;
    }
}
