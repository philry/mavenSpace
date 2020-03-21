package ioc12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc12/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        Resource resource=someBean.getResource();
        InputStream in = resource.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(in,"utf-8"));
        System.out.println(br.readLine());
    }
}
