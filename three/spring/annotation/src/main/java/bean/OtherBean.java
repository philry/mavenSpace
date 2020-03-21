package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 14:18
 * Description:
 * version:1.0
 */
@Component
public class OtherBean {

//    @Value("1")
//    private int id;
//    @Value("admin")
//    private String name;


//    private int id = 2;
//    private String name = "alice";


    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
