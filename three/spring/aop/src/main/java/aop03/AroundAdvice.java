package aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 16:00
 * Description:
 * version:1.0
 */
public class AroundAdvice implements MethodInterceptor {

    /**
     * 环绕通知
     * @param mi    用于获取与目标方法相关的信息
     * @return      返回的是目标方法具体的返回值
     * @throws Throwable
     */
    public Object invoke(MethodInvocation mi) throws Throwable {

        //获取目标类
        Object target = mi.getThis();
        //获取目标方法
        Method method = mi.getMethod();
        //获取参数列表
        Object[] args = mi.getArguments();

        System.out.println("环绕通知之前置");
        Object result = null;
        long begin = System.currentTimeMillis();
        try {
            //执行目标方法
            result = mi.proceed();

            long end = System.currentTimeMillis();
            System.out.println("环绕通知之后置");

            System.out.println("执行方法共花费了:"+(end-begin)+"毫秒");

        } catch (Throwable throwable) {
            System.out.println("环绕通知之异常通知");
            long end = System.currentTimeMillis();
            System.out.println("执行方法共花费了:"+(end-begin)+"毫秒");
        }


        return result;
    }
}
