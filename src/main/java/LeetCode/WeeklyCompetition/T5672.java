package LeetCode.WeeklyCompetition;

public class T5672 {
    public boolean check(int[] nums) {
        int left = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (left < nums[nums.length - 1]) {
                    return false;
                }
            }
        }
        return count<=1;
    }
}
