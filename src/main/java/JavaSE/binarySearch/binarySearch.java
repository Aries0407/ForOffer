package JavaSE.binarySearch;

/**
 * @author Aries
 * @date 2021/3/25 14:49
 */
public class binarySearch {

    /**
     * 迭代二分查找
     * 特点：只能验证数组中是否有该元素，不能处理元素中有重复值的情况
     *
     * @param nums
     * @param target
     * @return
     */
    public int binarySearch1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid - 1;
            } else if (target < nums[mid]) {
                right = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 腾讯笔试
     * 数字中可能有多个相同目标元素，查找目标元素的左边界索引，
     * 否则返回大于目标元素的最小值索引
     *
     * @param nums
     * @param target
     * @return
     */

    public int binarySearch2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            }
        }
        return left;
    }

    /**
     * 数字中可能有多个相同目标元素，查找目标元素的右边界索引，
     * 否则返回小于于目标元素的最大值索引
     *
     * @param nums
     * @param target
     * @return
     */
    public int binarySearch3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }
        }
        if (right < 0 || right > nums.length - 1) {
            return -1;
        }

        return right;
    }


    public static void main(String[] args) {
        binarySearch b = new binarySearch();
        int[] nums = {0, 1, 2, 3, 5, 5, 6, 7, 8, 9, 10};
        //System.out.println(b.binarySearch2(nums, 4));

    }
}


