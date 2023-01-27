package LeetCode.WeeklyCompetition;


public class WC5658 {
    public int maxAbsoluteSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return Math.abs(nums[0]);
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = -nums[i];
        }
        int res = 0;
        int res2 = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
            nums2[i] += Math.max(nums2[i - 1], 0);
            res2 = Math.max(res2, nums2[i]);
        }
        return Math.max(Math.abs(res), Math.abs(res2));
    }

}
