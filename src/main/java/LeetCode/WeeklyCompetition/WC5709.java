package LeetCode.WeeklyCompetition;

/**
 * @author Aries
 * @date 2021/3/21 10:33
 */
public class WC5709 {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int max = 0;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                max = Math.max(sum, max);
                sum = nums[i];
            }
        }
        return Math.max(sum, max);

    }
}
