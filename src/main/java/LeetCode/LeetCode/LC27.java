package LeetCode.LeetCode;

/**
 * @author Aries
 * @date 2021/4/19 11:20
 */
public class LC27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) return 0;
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            while (left < right && nums[left] != val) {
                left++;
            }
            while (left < right && nums[right] == val) {
                right--;
                count++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        if (nums[left] == nums[right] && nums[left] == val) count++;
        return nums.length - count;
    }
}
