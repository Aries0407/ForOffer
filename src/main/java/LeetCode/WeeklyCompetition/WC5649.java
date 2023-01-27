package LeetCode.WeeklyCompetition;

import java.util.Arrays;

public class WC5649 {
    public static int[] decode(int[] encoded, int first) {
        int[] ret = new int[encoded.length + 1];
        ret[0] = first;
        for (int i = 1; i < ret.length; i++) {
            ret[i] = ret[i-1] ^ encoded[i - 1];
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] encode = {1, 2, 3};
        int first = 1;
        System.out.println(Arrays.toString(WC5649.decode(encode, first)));
    }
}
