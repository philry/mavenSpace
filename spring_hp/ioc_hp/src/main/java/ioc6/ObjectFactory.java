package ioc6;

public class ObjectFactory {
    public static SomeService getObject(){
        return new SomeServiceImpl();
    }
}
