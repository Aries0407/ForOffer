package LeetCode.SwordToOffer2;

/**
 * @author Aries
 * @date 2021/8/22 0:53
 */
public class JZ009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int ret = 1;
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < nums.length) {
            ret *= nums[right];
            if (ret < 100) {
                count += right - left + 1;
            }
            while (left <= right && ret >= 100) {
                ret /= nums[left++];
            }
            right++;
        }
        return count;
    }
}
