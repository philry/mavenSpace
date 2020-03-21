package ioc12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 14:44
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) throws IOException {
//        File file = new File("ioc12/a.txt");

//        Resource resource = new ClassPathResource("ioc12/a.txt");
//        System.out.println(resource.exists());
//        System.out.println(resource.getFilename());
//
//        InputStream in = resource.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
//        System.out.println(br.readLine());


        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc12/applicationContext.xml");
//        Resource resource = ac.getResource("ioc12/a.txt");
//        Resource resource = ac.getResource("classpath:ioc12/a.txt");
//        InputStream in = resource.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
//        System.out.println(br.readLine());


        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        Resource resource = someBean.getResource();
        InputStream in = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
        System.out.println(br.readLine());







    }

}
