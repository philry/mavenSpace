package ioc07;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 11:19
 * Description:
 * version:1.0
 */
public class SomeServiceFactory {

    public SomeService getObject(){
        return new SomeServiceImpl();
    }

}
