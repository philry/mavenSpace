package aop04;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 10:27
 * Description:
 * version:1.0
 */
public class SomeServiceImpl implements SomeService {
    public void doSome() {
        System.out.println("SomeService---doSome");
    }

    public void doOther() throws SomeException {
        System.out.println("SomeService---doOther");
        throw new SomeException("SomeException");
    }
}
