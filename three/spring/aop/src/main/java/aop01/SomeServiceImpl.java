package aop01;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 13:40
 * Description:
 * version:1.0
 */
public class SomeServiceImpl implements SomeService{


    public void doSome() {
        System.out.println("doSome");
    }

    public void doOther() {
        System.out.println("doOther");
    }
}
