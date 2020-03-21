package aop05;


import org.aspectj.lang.JoinPoint;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 13:31
 * Description:
 * version:1.0
 */
public class LogAdvice {

    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(jp.getSignature().getName()+"方法即将执行,方法的参数数量为:"+args.length);
    }

    public void afterReturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName()+"方法正常执行完毕，方法的返回值为:"+result);
    }

    public void afterThrowing(JoinPoint jp,Exception e){
        System.out.println(jp.getSignature().getName()+"方法执行出错,异常为:"+e);
    }

    public void after(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"执行完毕");
    }



}
