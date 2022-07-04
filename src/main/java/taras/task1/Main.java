package taras.task1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //1) Deserialization
        String current = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = "src" + separator + "main" + separator + "java" + separator + "taras";
        String resourcesFile = "example2.json";
        Path file = Paths.get(current + separator + resourcesFolder + separator + resourcesFile);

        LearnHTML myLearnHTML = objectMapper.readValue(file.toFile(), LearnHTML.class);
        System.out.println(myLearnHTML);

        //2) Поменять значения объектов
        myLearnHTML.setId(001);
        myLearnHTML.setName("Read Bible");

        //Обьект для класса Owner
        Owner newOwnerObj = new Owner();
        newOwnerObj.setId(1001);
        newOwnerObj.setName("Olexander");
        newOwnerObj.setRollNo(742310);

        myLearnHTML.setOwner(newOwnerObj);

        //Обьект для класса Book
        //Книга 1
        Book newBookObj = new Book();
        newBookObj.setId(001);
        newBookObj.setName("St. Mathew");
        newBookObj.setOwner(5005);

        //Книга 2
        Book newBookObj2 = new Book();
        newBookObj2.setId(002);
        newBookObj2.setName("St. Johan");
        newBookObj2.setOwner(6006);

        newOwnerObj.setBooks(List.of(newBookObj, newBookObj2));

        //Вывожу результат в консоль
        System.out.println(myLearnHTML);

        //Serialization
        String myJson = objectMapper.writeValueAsString(myLearnHTML);
        System.out.println(myJson);

    }
}
