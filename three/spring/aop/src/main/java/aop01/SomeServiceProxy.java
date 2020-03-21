package aop01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 13:40
 * Description:
 * version:1.0
 */
public class SomeServiceProxy implements SomeService {

    private SomeService someService = new SomeServiceImpl();

    public void doSome() {
        System.out.println("doSome执行时间:"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:sss").format(new Date()));
        someService.doSome();

    }

    public void doOther() {
        System.out.println("doSome执行时间:"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:sss").format(new Date()));
        someService.doOther();
    }
}
