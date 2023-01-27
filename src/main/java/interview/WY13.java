package interview;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/18 19:19
 */
public class WY13 {

    private static HashSet<Double> set = new HashSet<>();
    private static boolean flag = false;

    public static double func(double k) {
        double i = 0;
        double big = 0;
        while (big < k) {
            big += Math.pow(2, i);
            i++;
        }
        double small = Math.pow(2, i - 1);
        if (big - k > k - small) {
            if (!set.contains(i - 1)) {
                set.add(i - 1);
            } else {
                flag = true;
                return Double.MAX_VALUE;
            }
            return small;
        } else if (big - k < k - small) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                flag = true;
                return Double.MAX_VALUE;
            }
            return big;
        }
        return big;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double sum = 0;
        double count = 0;
        while (sum != n) {
            if (sum > n) {
                sum -= func(sum - n);
                if (flag) {
                    System.out.println(-1);
                    return;
                }
            } else if (sum < n) {
                sum += func(n - sum);
                if (flag) {
                    System.out.println(-1);
                    return;
                }
            }
            count++;
        }
        System.out.println((int) count);
    }
}
