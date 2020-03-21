package aop04;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 10:28
 * Description:
 * version:1.0
 */
public class OtherServiceImpl implements OtherService {
    public void doSome() {
        System.out.println("OtherService---doSome");
    }

    public void doOther() {
        System.out.println("OtherService---doOther");
    }
}
