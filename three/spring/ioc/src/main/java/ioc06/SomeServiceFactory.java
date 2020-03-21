package ioc06;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 10:20
 * Description:
 * version:1.0
 */
public class SomeServiceFactory {

    public static SomeService getObject(){
        return new SomeServiceImpl();
    }

}
