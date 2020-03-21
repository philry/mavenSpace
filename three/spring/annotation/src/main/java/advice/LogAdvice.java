package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 15:10
 * Description:
 * version:1.0
 */
@Component
@Aspect
public class LogAdvice {

    //配置切点,切点对应也是一个方法
    @Pointcut(value = "execution(* bean.*.*(..))")
//    @Pointcut("within(bean.SomeService)")
    public void pointcutName(){}

    @Before(value = "pointcutName()")
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法即将执行");
    }

    @After("pointcutName()")
    public void after(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法执行完毕");
    }

    @AfterReturning(value="pointcutName()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println("方法正常返回,返回值为:"+result);
    }

    @AfterThrowing(value = "pointcutName()",throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e){
        System.out.println("方法执行出错,异常为:"+e);
    }


    @Around("pointcutName()")
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
