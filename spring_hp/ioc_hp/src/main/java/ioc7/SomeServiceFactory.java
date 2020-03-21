package ioc7;

public class SomeServiceFactory {
    public SomeService getObject(){
        return new SomeServiceImpl();
    }
}
