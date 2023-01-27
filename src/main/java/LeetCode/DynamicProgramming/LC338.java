package LeetCode.DynamicProgramming;

/**
 * @author Aries
 * @date 2021/5/3 20:09
 */
public class LC338 {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        int cur = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) cur = i;
            dp[i] = dp[i - cur] + 1;
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(4 & 3);
    }
}
