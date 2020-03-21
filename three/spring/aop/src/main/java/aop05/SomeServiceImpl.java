package aop05;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 13:31
 * Description:
 * version:1.0
 */
public class SomeServiceImpl implements SomeService {
    public void doSome() {
        System.out.println("doSome");
    }

    public void doOther() {
        System.out.println("doOther");
    }

    public String doSome(String s) {
        System.out.println("带返回值的doSome");
        return s;
    }
}
