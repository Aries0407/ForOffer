package LeetCode.LeetCode;

public class T213 {
    /**
     * dp[i][0] 今天没偷窃，也没偷旁边的
     * dp[i][1] 今天没偷窃，偷了旁边的
     * dp[i][2] 今天偷了
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        //可以偷第一家，但不能偷最后一家
        int robFirst = robHelper(nums, 0, nums.length - 2);
        //可以偷最后一家，但不能偷第一家
        int robLast = robHelper(nums, 1, nums.length - 1);
        //选择偷第1家和不偷第1家结果的最大值
        return Math.max(robFirst, robLast);
    }

    private int robHelper(int[] num, int start, int end) {
        int steal = 0, noSteal = 0;
        for (int j = start; j <= end; j++) {
            int temp = steal;
            steal = noSteal + num[j];
            noSteal = Math.max(noSteal, temp);
        }
        return Math.max(steal, noSteal);
    }


    public static void main(String[] args) {

    }
}
