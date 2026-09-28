import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Sales {
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> salesMap = new HashMap<>();
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            String name = parts[0];
            long sale = Long.parseLong(parts[1]);
            salesMap.merge(name, sale, Long::sum);
        }
        return salesMap;
    }
}