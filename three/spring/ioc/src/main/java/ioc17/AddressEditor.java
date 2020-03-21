package ioc17;

import java.beans.PropertyEditorSupport;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 10:33
 * Description:
 * version:1.0
 */
public class AddressEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        //想要将一个字符串转换为指定的对象
        //首先该字符串需要遵循某种规则
        //假设此时字符串格式为xxx-yyy
        //当将其转换为Address的时候
        //xxx表示省份
        //yyy表示城市
        String[] arr = text.split("-");
        Address address = new Address();
        address.setProvince(arr[0]);
        address.setCity(arr[1]);
        setValue(address);
    }

}
