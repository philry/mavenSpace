package aop04;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 11:44
 * Description:
 * version:1.0
 */
public class AroundAdvice {

    public Object around(ProceedingJoinPoint jp) throws Throwable{
        //目标类
        Object target = jp.getThis();
        //目标方法名
        String methodName = jp.getSignature().getName();
        //目标的方法参数列表
        Object[] args = jp.getArgs();

        Object result = null;
        System.out.println("环绕通知之前置通知");
        long begin = System.currentTimeMillis();

        try {
            result = jp.proceed();
            long end = System.currentTimeMillis();

            System.out.println("环绕通知之正常返回通知");
            System.out.println("执行目标类"+target+"中的目标方法"+methodName+"共花费了"+(end-begin)+"毫秒");
        } catch (Throwable throwable) {
            long end = System.currentTimeMillis();

            System.out.println("环绕通知之异常通知");
            System.out.println("执行目标类"+target+"中的目标方法"+methodName+"共花费了"+(end-begin)+"毫秒");
        }

        return result;
    }

}
