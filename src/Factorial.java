import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger answer = BigInteger.ONE;
        if (value == 0) {
            return BigInteger.ONE;
        } else if (value == 1) {
            return BigInteger.ONE;
        } else if (value < 0) {
            return BigInteger.ZERO;
        } else if (value > 1) {
            for (int x = 2; x <= value; x++) {
                answer = answer.multiply(BigInteger.valueOf(x));
            }
        }
        return answer;
    }
}
