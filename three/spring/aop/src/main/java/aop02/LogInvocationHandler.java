package aop02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 13:51
 * Description:
 * version:1.0
 */
public class LogInvocationHandler implements InvocationHandler {

    private Object target;

    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理对象,没用
     * @param method 目标方法，当前正在调用的方法
     * @param args 方法的参数列表
     * @return 目标方法的返回值
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"方法执行时间:"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:sss").format(new Date()));
        return method.invoke(target,args);
    }
}
