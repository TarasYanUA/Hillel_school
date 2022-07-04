package taras.task2;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, XMLStreamException {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);

        //1) Deserialization
        String current = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = "src" + separator + "main" + separator + "java" + separator + "taras";
        String resourcesFile = "HometaskXML.xml";
        Path myFile = Paths.get(current + separator + resourcesFolder + separator + resourcesFile);

        Person myXmlMapper = xmlMapper.readValue(myFile.toFile(), Person.class);
        System.out.println(myXmlMapper);

        //2) Поменять значения объектов
        myXmlMapper.setFirstName("Kristina");
        myXmlMapper.setLastName("Oneil");

        //Вывожу результат в консоль
        System.out.println(myXmlMapper);

        //3) Serialization
        String myXmlFile = xmlMapper.writeValueAsString(myXmlMapper);
        System.out.println(myXmlFile);

    }
}
