package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {
    @Pointcut("execution(* bean.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法即将执行");
    }

    @After("pointCut()")
    public void after(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法执行结束");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName()+"方法执行结束，返回结果为"+result);
    }

    public void afterThrow(JoinPoint jp,Exception e){
        System.out.println(jp.getSignature().getName()+"方法执行出错,异常为"+e);
    }

    @Around("pointCut()")
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
