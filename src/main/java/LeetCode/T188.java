package LeetCode;


public class T188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[2 * k + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i += 2) {
            dp[i] = -prices[0];
        }
        int power = 1;
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                dp[j] = Math.max(dp[j - 1] - power * prices[i], dp[j]);
                power = -power;
            }
        }
        return dp[2 * k];
    }

    public static void main(String[] args) {

    }
}
