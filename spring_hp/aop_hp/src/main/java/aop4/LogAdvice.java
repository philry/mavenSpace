package aop4;

public class LogAdvice {
    public void a(){
        System.out.println("前置通知");
    }
    public void b(){
        System.out.println("正常返回的后置通知");
    }
    public void c(){
        System.out.println("异常通知");
    }
    public void d(){
        System.out.println("后置通知");
    }
}
