package LeetCode.LeetCode;

import java.util.Arrays;

public class T135 {

    public int candy(int[] ratings) {
        int[] ltr = new int[ratings.length];
        int[] rtl = new int[ratings.length];
        Arrays.fill(ltr, 1);
        Arrays.fill(rtl, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                ltr[i] = ltr[i - 1] + 1;
            }
        }
        int count = Math.max(rtl[rtl.length - 1], ltr[ltr.length - 1]);
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                rtl[i] = rtl[i + 1] + 1;
            }
            count += rtl[i];
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
