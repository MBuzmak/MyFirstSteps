import java.math.BigInteger;
import java.util.stream.LongStream;

public class FactorialStrAPI {
    public BigInteger factorial(int value) {
        return LongStream.rangeClosed(1, value)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
