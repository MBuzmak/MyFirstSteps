import java.util.HashSet;
import java.util.Set;

public class Diff {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<T> result2 = new HashSet<>(set1);
        result2.retainAll(set2);
        result.removeAll(result2);
        return result;
    }
}
