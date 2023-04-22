package LeetCode.LeetCode;


/**
 * @author Aries
 * @date 2021/4/5 14:45
 */
public class LC31 {
    public void nextPermutation(int[] nums) {
        int firstIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                firstIndex = i - 1;
                break;
            }
        }
        if (firstIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int secondIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[firstIndex]) {
                secondIndex = i;
                break;
            }
        }
        swap(nums, firstIndex, secondIndex);
        reverse(nums, firstIndex + 1, nums.length - 1);

    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
