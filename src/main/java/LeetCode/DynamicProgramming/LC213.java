package LeetCode.DynamicProgramming;

import java.util.Arrays;

/**
 * @author Aries
 * @date 2021/4/15 9:36
 */
public class LC213 {
    //划分成两次动态规划
    public int robHelper(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);
        return Math.max(robHelper(nums1), robHelper(nums2));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums1 = new int[nums.length - 1];
        int[] nums2 = new int[nums.length - 1];
        nums1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        nums2 = Arrays.copyOfRange(nums, 1, nums.length);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
