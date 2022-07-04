
package taras.task1;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "rollNo",
    "name",
    "books"
})
public class Owner implements Serializable {

    @JsonProperty("id")
    private int id;
    @JsonProperty("rollNo")
    private int rollNo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("books")
    private List<Book> books = null;


    public Owner() {
    }

    public Owner(int id, int rollNo, String name, List<Book> books) {
        super();
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.books = books;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("rollNo")
    public int getRollNo() {
        return rollNo;
    }

    @JsonProperty("rollNo")
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("books")
    public List<Book> getBooks() {
        return books;
    }

    @JsonProperty("books")
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Owner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("rollNo");
        sb.append('=');
        sb.append(this.rollNo);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("books");
        sb.append('=');
        sb.append(((this.books == null)?"<null>":this.books));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
