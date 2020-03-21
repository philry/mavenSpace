package aop3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class AroundService implements MethodInterceptor {
    public Object invoke(MethodInvocation me) throws Throwable {
        long begin=System.currentTimeMillis();
        System.out.println("开始时间:"+begin);
        Object target=me.getThis();
        Method method=me.getMethod();
        Object[] args=me.getArguments();
        Object result=null;
        try {
            result = me.proceed();
            long end = System.currentTimeMillis();
            System.out.println("结束时间:"+end);
            long time = end - begin;
            System.out.println("用时:"+time);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知之异常通知");
        }
        return result;
    }
}
