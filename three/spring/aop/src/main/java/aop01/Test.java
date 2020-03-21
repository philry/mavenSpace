package aop01;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 13:41
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        SomeService someService = new SomeServiceProxy();

        someService.doSome();

        someService.doOther();

    }

}
