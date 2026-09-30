import com.deserialization.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeserializeTest {

    public static final String JSON =
            "{\"id\": 2, \"name\": \"faye\", \"email\": {\"email\": \"faye@reqres.in\"}}";

    @Test
    void userDeserialize() throws Exception {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        User user = mapper.readValue(JSON, User.class);

        assertEquals(2, user.getId());
        assertEquals("faye", user.getName());
    }
}