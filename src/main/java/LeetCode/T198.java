package LeetCode;

public class T198 {
    /**
     * @param nums
     * @return dp[i][0] : 该屋子没偷窃，也没有偷上家的
     * dp[i][1]: 偷了该屋子
     * dp[i][2]: 沒偷该屋子，偷了上家的
     */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[][] dp = new int[nums.length][3];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][0] + nums[i], dp[i - 1][2] + nums[i]);
            dp[i][2] = dp[i - 1][1];
        }
        return Math.max(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    public static void main(String[] args) {

    }
}
