package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/12 18:54
 */
public class DiDi22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        quickSort(0, nums.length - 1, nums, nums.length - m);
        for (int i = 0; i < m; i++) {
            sum += nums[nums.length - i - 1];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(sum);
    }

    public static void quickSort(int left, int right, int[] nums, int k) {
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
        if (i == k) return;
        if (i > k)
            quickSort(left, i - 1, nums, k);
        if (i < k)
            quickSort(i + 1, right, nums, k);
    }

}
