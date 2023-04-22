package LeetCode.LeetCode;

/**
 * @author Aries
 * @date 2021/4/24 9:48
 */
public class LC33 {
    int index = -1;

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        binarySearch(0, nums.length - 1, nums, target);
        return index;
    }

    private void binarySearch(int left, int right, int[] nums, int target) {
        if (left > right) {
            return;
        }
        int mid = left + (right - left) / 2;
        if (target == nums[mid]) {
            index = mid;
            return;
        }
        if (target == nums[left]){
            index = left;
            return;
        }
        if (target == nums[right]){
            index = right;
            return;
        }
        if (nums[left] < nums[mid]) {
            if (target > nums[left] && target < nums[mid]) {
                binarySearch(left + 1, mid - 1, nums, target);
            } else {
                binarySearch(mid + 1, right - 1, nums, target);
            }
        } else {
            if (target > nums[mid] && target < nums[right]) {
                binarySearch(mid + 1, right - 1, nums, target);
            } else {
                binarySearch(left + 1, mid - 1, nums, target);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {3, 1};
        int target = 1;
        LC33 l = new LC33();
        System.out.println(l.search(nums, target));
    }
}
