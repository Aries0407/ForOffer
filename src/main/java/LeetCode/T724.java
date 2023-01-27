package LeetCode;

public class T724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum * 2 + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
