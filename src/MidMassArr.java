import java.util.Arrays;

public class MidMassArr {
    public static int[] getMiddleOfArray(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int rightOfMid = numbers.length / 2;
            int leftOfMid = rightOfMid - 1;
            int[] mid = Arrays.copyOfRange(numbers, leftOfMid, rightOfMid+1);
            return mid;
        } else {
            int middle = (numbers.length - 1) / 2;
            int[] mid = Arrays.copyOfRange(numbers, middle, middle+1);
            return mid;
        }
    }
}