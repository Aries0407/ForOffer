package LeetCode.WeeklyCompetition;

import java.util.Arrays;

public class WC5673 {
    public int maximumScore(int a, int b, int c) {
        int[] num = {a, b, c};
        Arrays.sort(num);
        a = num[2];
        b = num[1];
        c = num[0];
        if (b == 0 && c == 0) return 0;
        if (a == b && a > c) {

        }
        if (a == b + c) {
            return a;
        }
        if (a > b + c) {
            return b + c;
        }
        if (a < b + c && a + 2 <= b + c) {
            return a + 1;
        }

        if (a < b + c && a + 1 == b + c) {
            return a;
        }
        if (a < b + c && c == 1) {
            return a;
        }
        return 0;
    }

}
