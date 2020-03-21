package ioc15;

import com.sun.org.apache.bcel.internal.generic.RET;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 9:13
 * Description:
 * version:1.0
 */
public class SomeBeanPostProcessor implements BeanPostProcessor {


    //实例化-->DI-->-->postProcessBeforeInitialization-->初始化-->postProcessAfterInitialization-->就绪-->使用-->销毁
    //在初始化之前做后处理
    public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
        return bean;
    }

    /**
     * 初始化之后做后处理
     * @param bean  正在做后处理的bena是谁
     * @param id    正在做后处理的bean的id是多少
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
        //由于后处理bean是对于整个容器中所有的bean做后处理
        //而此时我们只希望对SomeBean做后处理
        //怎么才能知道当前正在处理的是SomeBean
        //方式一
//        if("someBean".equals(id)){
//
//        }
        //方式二
        if(bean instanceof SomeBean){
            SomeBean someBean = (SomeBean) bean;
            someBean.setName(someBean.getName().toUpperCase());
        }
        if("otherBean".equals(id)){
            OtherBean otherBean = (OtherBean) bean;
            otherBean.setName(otherBean.getName().toLowerCase());
        }
        return bean;
//        return "admin";
    }
}
