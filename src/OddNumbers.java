public class OddNumbers {
    public static void printOddNumbers(int[] arr) {
        boolean numFirst=true;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (numFirst==false){
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                numFirst=false;
            }
        }
        System.out.println("]");
    }
}
