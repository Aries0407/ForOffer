package LeetCode.WeeklyCompetition;

public class WC5650 {
    public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        for (int i = 0; i < allowedSwaps.length; i++) {
            int left = allowedSwaps[i][0];
            int right = allowedSwaps[i][1];
            int temp = source[left];
            source[left] = source[right];
            source[right] = temp;
        }
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != target[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
         int []num = {3,2,5,1,4};
    }
}
