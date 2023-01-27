package LeetCode;

/**
 * @author Aries
 * @date 2021/4/18 17:08
 */
public class LC26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int left = 0;
        int right = 1;
        int n = nums.length;
        while (right < n) {
            if (nums[left] != nums[right]) {
                nums[left] = nums[right];
                left++;
            } else {
                right++;
            }
        }
        return left + 1;
    }
}
