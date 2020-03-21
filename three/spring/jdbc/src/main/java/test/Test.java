package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 9:29
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) throws SQLException, InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = (DataSource) ac.getBean("dataSource");

        Connection conn = dataSource.getConnection();
        System.out.println("第一个连接:"+conn);

        Thread.sleep(4000);
        conn.close();
        Connection conn2 = dataSource.getConnection();
        System.out.println("第二个连接:"+conn2);



    }

}
