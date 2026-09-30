import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private String email;

    public User() {}

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}

    @JsonProperty("email")
    private void unpackEmail(Map<String, String> emailObj) {
        this.email = emailObj.get("email");
    }

    @Override
    public String toString() {
        return "{id: " + id + ", name: '" + name + "', email: '" + email + "'}";
    }
}
