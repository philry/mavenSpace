package aop03;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 14:57
 * Description:
 * version:1.0
 */
public class LogAdvice implements MethodBeforeAdvice {


    /**
     *
     * @param method  目标方法
     * @param objects  方法的参数列表
     * @param o 目标类
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+"方法执行时间:"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date()));
    }
}
