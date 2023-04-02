package LeetCode.SwordToOffer;

public class JZ63 {


    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 7, 4};
        JZ63 jz63 = new JZ63();
        System.out.println(jz63.maxProfit(a));
    }

    /**
     *利用数组存储股票价格当天与前一天的价格差
     * 那么可以获得的最大利润便是数组中连续元素的最大和问题
     * 即最大子数组和问题
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] d_value = new int[prices.length];
        for (int i = 1; i < d_value.length; i++) {
            d_value[i] = prices[i] - prices[i - 1];
        }
        int profit = 0;
        int temp = 0;
        for (int i : d_value) {
            temp += i;
            temp = temp > 0 ? temp : 0;
            profit = Math.max(temp, profit);
        }
        return profit;
    }
}
