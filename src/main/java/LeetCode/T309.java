package LeetCode;

public class T309 {
    /**
     * @param prices
     * @return dp[i][0]: 不持有股票，且不处于冷冻期; 那么昨天的状态可能是 1、昨天也不持有股票且不处于冷冻期 2、不持有股票，处于冷冻期
     * dp[i][1]: 持有股票; 那么昨天的状态可能是 1、昨天也不持有股票且不处于冷冻期 2、昨天也持有股票
     * dp[i][2]:不持有股票，处于冷冻期; 那么昨天的状态可能是 1、昨天也不持有股票且不处于冷冻期 2、不持有股票，处于冷冻期
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[][] dp = new int[prices.length][4];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][2]);
    }

    public static void main(String[] args) {

    }
}
