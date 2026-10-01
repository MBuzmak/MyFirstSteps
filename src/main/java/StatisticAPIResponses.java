import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StatisticAPIResponses {
    public long successCodes(List<Integer> statusCodes) {
        return statusCodes.stream()
                .filter(code -> code >= 200 && code < 300)
                .count();
    }

    public long clientErrors(List<Integer> statusCodes) {
        return statusCodes.stream()
                .filter(code -> code >= 400 && code < 500)
                .count();
    }

    public boolean hasServerError(List<Integer> statusCodes) {
        return statusCodes.stream()
                .anyMatch(code -> code >= 500);
    }

    public Optional<Integer> mostOftenStatus(List<Integer> statusCodes) {
        return statusCodes.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public double percentSuccessCodes(List<Integer> statusCodes) {
        long success = statusCodes.stream()
                .filter(code -> code >= 200 && code < 300)
                .count();
        return (double) success / statusCodes.size() * 100;
    }
}
