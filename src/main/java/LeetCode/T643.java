package LeetCode;

public class T643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i <= k - 1; i++) {
            sum += nums[i];
        }
        double avg = sum / (k * 1.0);
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            avg = Math.max(avg, sum / (k * 1.0));
        }
        return avg;
    }
}
