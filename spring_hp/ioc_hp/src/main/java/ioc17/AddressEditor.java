package ioc17;

import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] arr =text.split("-");
        Address address=new Address();
        address.setProvince(arr[0]);
        address.setCity(arr[1]);
        setValue(address);
    }
}
