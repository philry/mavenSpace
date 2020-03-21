package aop03;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 15:08
 * Description:
 * version:1.0
 */
public class SomeExceptionAdvice implements ThrowsAdvice {

    //当前实现ThrowsAdvice接口的时候，并没有提示我们要重写的方法
    //原因是该接口存在多个方法，而这些方法的方法名是一致的
    //即存在方法的重载
    //这些方法我们只需要实现其中任意一个就行
    //所以并没有提示我们重写哪一个，需要我们自己去选择

    /**
     * 异常通知
     * @param method    目标方法
     * @param args      方法的参数列表
     * @param target    目标类
     * @param ex        异常类型
     */
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
        System.out.println(target.getClass().getName()+"类"+method.getName()+"方法执行出错,异常原因:"+ex);
    }

}
