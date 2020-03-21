package ioc12;

import org.springframework.core.io.Resource;

public class SomeBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
