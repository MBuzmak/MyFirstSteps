public class Main {
    public static void main(String[] args) {
        Human human = Human.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .build();
        System.out.println(human);
        human.setFirstName("NewFirstName");
        System.out.println(human);
    }
}
