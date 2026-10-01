import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortUsers {
    public List<String> emailOld25(List<User> users) {
        return users.stream()
                .filter(age -> age.getAge() > 25)
                .map(User::getEmail)
                .sorted()
                .collect(Collectors.toList());
    }

    public Optional<User> olderUser(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge));
    }

    public boolean hasAdmin(List<User> users) {
        return users.stream()
                .anyMatch(adm -> "ADMIN".equals(adm.getRole()));
    }

    public Map<String, List<User>> usersRoles(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getRole));
    }

    public String usernames(List<User> users) {
        return users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }
}
