package taras.task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.io.Serializable;
import java.util.Arrays;

public class PhoneNumbers implements Serializable {
    @JacksonXmlProperty(localName = "phoneNumbers")
    private String[] phoneNumbers;

    public String[] getPhoneNumbers() { return phoneNumbers; }
    public void setPhoneNumbers(String[] value) {
        this.phoneNumbers = value;
    }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
}
