import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Response {
    public static void main(String[] args) throws JsonProcessingException {
        String response = "{\"data\": {\"id\": 2, \"email\": \"a@b.com\"}, \"support\": {\"url\": \"https://...\", \"text\": \"To keep...\"}}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response);
        int id = root.path("data").path("id").asInt();
        String email = root.path("data").path("email").asText();
        String url = root.path("support").path("url").asText();
        System.out.println(id);
        System.out.println(email);
        System.out.println(url);
    }
}
