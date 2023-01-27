package interview;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Aries
 * @date 2021/3/28 20:16
 */
public class ByteDance4 {

    public static int rob(Vector<Integer> vector) {
        if (vector.isEmpty()) {
            return 0;
        }
        if (vector.size() == 1) {
            return vector.get(0);
        }

        int[] dp = new int[vector.size()];
        dp[0] = vector.get(0);
        dp[1] = Math.max(vector.get(0),vector.get(1));
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(vector.get(i) + dp[i - 2], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        String l = sc.nextLine();
        Scanner scan_l = new Scanner(l);
        while (scan_l.hasNextLine()) {
            vector.add(scan_l.nextInt());
        }


        System.out.println(rob(vector));


    }
}
