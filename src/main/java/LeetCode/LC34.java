package LeetCode;

/**
 * @author Aries
 * @date 2021/4/23 22:14
 */
public class LC34 {
    int L = -1;
    int R = -1;


    public int[] searchRange(int[] nums, int target) {
        binarySearch(0, nums.length - 1, target, nums);
        int[] ret = new int[2];
        ret[0] = L;
        ret[1] = R;
        System.out.println(L);
        System.out.println(R);
        return ret;
    }

    private void binarySearch(int left, int right, int target, int[] nums) {
        if (left > right) return;
        int mid = left + (right - left) / 2;
        if (target > nums[mid]) {
            binarySearch(mid + 1, right, target, nums);
        } else if (target < nums[mid]) {
            binarySearch(left, mid - 1, target, nums);
        } else {
            L = binarySearchLeft(left, mid, target, nums);
            R = binarySearchRight(mid, right, target, nums);
        }
    }

    private int binarySearchLeft(int left, int right, int target, int[] nums) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 最后要检查 left 越界的情况
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;

    }

    private int binarySearchRight(int left, int right, int target, int[] nums) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        LC34 lc34 = new LC34();
        int ret[] = lc34.searchRange(nums, target);
        System.out.println();
    }
}
