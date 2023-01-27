package LeetCode.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Aries
 * @date 2021/9/4 21:02
 */
public class MyMergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static void sort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int i = left;
        int ii = left;
        int j = mid + 1;
        int[] tmp = new int[nums.length];
        int index = left;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                tmp[index++] = nums[i++];
            } else {
                tmp[index++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[index++] = nums[i++];
        }

        while (j <= right) {
            tmp[index++] = nums[j++];
        }

        while (ii <= right) {
            nums[ii] = tmp[ii++];
        }
    }

}
