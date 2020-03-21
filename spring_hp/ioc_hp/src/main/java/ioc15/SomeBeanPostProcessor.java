package ioc15;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SomeBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
        if(bean instanceof SomeBean ){
            SomeBean someBean= (SomeBean) bean;
            someBean.setName(someBean.getName().toUpperCase());
        }
        if("otherBean".equals(id)){
            OtherBean otherBean= (OtherBean) bean;
            otherBean.setName(otherBean.getName().toLowerCase());
        }
        return bean;
    }
}
