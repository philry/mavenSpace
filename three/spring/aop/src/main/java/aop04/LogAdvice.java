package aop04;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 10:28
 * Description:
 * version:1.0
 */
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
