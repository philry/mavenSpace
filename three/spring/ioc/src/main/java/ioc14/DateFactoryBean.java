package ioc14;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 16:40
 * Description:
 * version:1.0
 */
public class DateFactoryBean implements FactoryBean {

    private String year;
    private String month;
    private String day;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Object getObject() throws Exception {
        Date date = new SimpleDateFormat("yyyyMMdd").parse(year+month+day);
        return date;
    }

    public Class<?> getObjectType() {
        return Date.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
