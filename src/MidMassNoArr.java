public class MidMassNoArr {
    public static int[] getMiddleOfArray(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int rightOfMid = numbers.length / 2;
            int leftOfMid = rightOfMid - 1;
            int[] mid = new int[2];
            mid[0] = numbers[leftOfMid];
            mid[1] = numbers[rightOfMid];
            return mid;
        } else {
            int middle = (numbers.length - 1) / 2;
            int[] mid = new int[1];
            mid[0] = numbers[middle];
            return mid;
        }
    }
}
