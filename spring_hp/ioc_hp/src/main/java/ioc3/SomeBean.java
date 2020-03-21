package ioc3;

import java.util.*;

public class SomeBean {
    private List list;
    private Map map;
    private Set set;
    private String[] arr;
    private Properties properties;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", arr=" + Arrays.toString(arr) +
                ", properties=" + properties +
                '}';
    }
}
