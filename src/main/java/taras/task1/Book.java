//Десиарелизация: 1 час 07 минута и 09 минута, 1:19
package taras.task1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "owner"
})
public class Book implements Serializable {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private int owner;


    public Book() {
    }

    public Book(int id, String name, int owner) {
        super();
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public int getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Book.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(this.owner);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
