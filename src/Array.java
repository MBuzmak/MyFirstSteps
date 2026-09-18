public class Array {
    public static void printArray(int[] numbers) {
        if (numbers.length < 1) {
            System.out.print("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
        return;
    }
}
