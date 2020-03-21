package aop2;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        SomeService someService= (SomeService) Proxy.newProxyInstance(SomeServiceImpl.class.getClassLoader(),SomeServiceImpl.class.getInterfaces(),new LogInvocationHandler(new SomeServiceImpl()));
        someService.doSome();
        someService.doOther();
    }
}
