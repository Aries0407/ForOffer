package interview;

import java.util.Arrays;

/**
 * @author Aries
 * @date 2021/9/14 20:24
 */
public class JDD {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 2, 7, 8, 9, 10, 5, 12, 4, 7, 6};
        //quickSort(0, nums.length - 1, nums);
        //System.out.println(Arrays.toString(nums));
        quickSort(0, nums.length - 1, nums, nums.length - 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int left, int right, int[] nums, int m) {
        if (left >= right) return;
        int i = left;
        int j = right;
        int base = nums[left];
        while (i < j) {
            while (i < j && base <= nums[j]) j--;
            while (i < j && base >= nums[i]) i++;
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[left] = nums[i];
        nums[i] = base;
        if (i == m)
            return;
        if (i < m) {
            quickSort(i + 1, right, nums, m);
        }
        if (i > m) {
            quickSort(left, i - 1, nums, m);
        }
    }


    public static void quickSort(int left, int right, int[] nums) {
        if (left >= right) return;
        int i = left;
        int j = right;
        int base = nums[left];
        while (i < j) {
            while (i < j && base <= nums[j]) j--;
            while (i < j && base >= nums[i]) i++;
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[left] = nums[i];
        nums[i] = base;
        quickSort(left, i - 1, nums);
        quickSort(i + 1, right, nums);
    }
}
