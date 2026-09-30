import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialize {
    public class CreateUserRequest {
        private String name;
        private String job;
        public CreateUserRequest() {}
        public CreateUserRequest(String name, String job) {
            this.name = name;
            this.job = job;
        }
        public String getName() {return name;}
        public String getJob() {return job;}
        public void setName(String name) {this.name = name;}
        public void setJob(String job) {this.job = job;}
        @Override
        public String toString(){return "{name: "+name+", job: "+job+"}";}
    }
    public void buildRequestBody(String name, String job) throws JsonProcessingException {
        CreateUserRequest result = new CreateUserRequest(name, job);
        ObjectMapper mapper = new ObjectMapper();
        String JSON = mapper.writeValueAsString(result);
        System.out.println(JSON);
    }
}