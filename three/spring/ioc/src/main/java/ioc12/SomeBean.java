package ioc12;

import org.springframework.core.io.Resource;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 14:44
 * Description:
 * version:1.0
 */
public class SomeBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
