package LeetCode;

public class T121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int ret = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            ret = Math.max(ret, prices[i] - minPrice);
        }
        return ret;
    }

    public int maxProfit2(int[] prices) {
        int[] profit = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            profit[i] = prices[i] - prices[i - 1];
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < profit.length; i++) {
            sum += profit[i];
            sum = sum > 0 ? sum : 0;
            max = Math.max(sum, max);
        }
        return max;
    }

}
