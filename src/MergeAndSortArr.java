import java.util.Arrays;

public class MergeAndSortArr {
    public static int[] mergeAndSort(int[] first, int[] second){
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int i = first.length; i < merged.length; i++) {
            merged[i] = second[i - first.length];
        }
        Arrays.sort(merged);
        return merged;
    }
}
