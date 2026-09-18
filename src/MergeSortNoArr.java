import java.util.Arrays;

public class MergeSortNoArr {
    public static int[] mergeAndSort(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int i = first.length; i < merged.length; i++) {
            merged[i] = second[i - first.length];
        }
        for (int i = 0; i < merged.length - 1; i++) {
            for (int x = 0; x < merged.length - 1 - i; x++) {
                if (merged[x] > merged[x + 1]) {
                    int cash = merged[x];
                    merged[x] = merged[x + 1];
                    merged[x + 1] = cash;
                }
            }
        }
        return merged;
    }
}
