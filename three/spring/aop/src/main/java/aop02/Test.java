package aop02;

import java.lang.reflect.Proxy;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 13:49
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        SomeService someService = (SomeService) Proxy.newProxyInstance(
                SomeServiceImpl.class.getClassLoader(),
                SomeServiceImpl.class.getInterfaces(),
                new LogInvocationHandler(new SomeServiceImpl())
        );
        someService.doSome();

        someService.doOther();


        OtherService otherService = (OtherService) Proxy.newProxyInstance(
                OtherServiceImpl.class.getClassLoader(),
                OtherServiceImpl.class.getInterfaces(),
                new LogInvocationHandler(new OtherServiceImpl())
        );
        otherService.a();
        otherService.b();

    }

}
