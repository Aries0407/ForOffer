package LeetCode.WeeklyCompetition;

import java.util.Arrays;

public class WC5654 {
    public int countBalls(int lowLimit, int highLimit) {
        if (lowLimit > highLimit) return 0;
        int ret = numSum(lowLimit);
        if (lowLimit == highLimit) return ret;
        int temp = highLimit;
        int len = 0;
        while (temp != 0) {
            len++;
            temp /= 10;
        }
        int[] num = new int[9 * len + 1];
        for (int i = lowLimit; i <= highLimit; i++) {
            num[numSum(i)]++;
        }
        Arrays.sort(num);
        ret = num[num.length - 1];
        return ret;
    }

    private int numSum(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        WC5654 w = new WC5654();
        w.countBalls(4, 7);

    }
}
