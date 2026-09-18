public class SubArrayBetween {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        if (numbers.length < 1 || start > end) {
            return new int[]{0};
        }
        int indexStart = -1;
        int indexEnd = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start) {
                indexStart = i;
                break;
            }
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] <= end) {
                indexEnd = i;
                break;
            }
        }
        if (indexStart == -1 || indexEnd == -1 || indexStart > indexEnd) {
            return new int[]{0};
        }
        int newMassiveLenght = indexEnd - indexStart + 1;
        int[] newMassive = new int[newMassiveLenght];
        for (int i=0; i<newMassiveLenght; i++){
            newMassive[i]=numbers[indexStart+i];
        }
        return newMassive;
    }
}
