package LeetCode;

import java.util.Arrays;

public class T480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ret = new double[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int[] temp = Arrays.copyOfRange(nums, i, i + k - 1);
            ret[i - k + 1] = helper(temp);
        }
        return ret;

    }

    private double helper(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        double ret = 0;
        if (len % 2 == 0) {
            ret = nums[len / 2] / 2.0 + nums[len / 2 - 1] / 2.0;
        } else {
            ret = nums[len / 2];
        }
        return ret;
    }
}
