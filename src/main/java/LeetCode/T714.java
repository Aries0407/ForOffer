package LeetCode;

public class T714 {

    public int maxProfit(int[] prices, int fee) {

        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int tmp = dp[0];
            dp[0] = Math.max(dp[0], dp[0] + prices[i] - fee);
            dp[1] = Math.max(dp[1], tmp - prices[i]);
        }
        return dp[0];
    }


    public static void main(String[] args) {

    }
}
