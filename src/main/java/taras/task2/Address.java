package taras.task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.io.Serializable;

public class Address implements Serializable {
    @JacksonXmlProperty(localName = "streetName")
    private String streetName;

    @JacksonXmlProperty(localName = "city")
    private String city;

    public String getStreetName() { return streetName; }
    public void setStreetName(String value) { this.streetName = value; }

    public String getCity() { return city; }
    public void setCity(String value) { this.city = value; }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
