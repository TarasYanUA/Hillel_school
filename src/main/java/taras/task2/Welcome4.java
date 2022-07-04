package taras.task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;

public class Welcome4 implements Serializable {
    @JacksonXmlElementWrapper(localName = "Person")
    private Person person;

    public Person getPerson() { return person; }
    public void setPerson(Person value) { this.person = value; }

    @Override
    public String toString() {
        return "Welcome4{" +
                "person=" + person +
                '}';
    }
}
