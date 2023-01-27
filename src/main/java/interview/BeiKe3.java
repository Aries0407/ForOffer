package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/8 20:31
 */
public class BeiKe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxLen = 0;
        int big = 0;
        int small = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > k) big++;
                else small++;
            }
            if (big > small) maxLen = Math.max(nums.length - i, maxLen);
            big = 0;
            small = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] > k) big++;
                else small++;
            }
            if (big > small) maxLen = Math.max(i + 1, maxLen);
            big = 0;
            small = 0;
        }
        System.out.println(maxLen);
    }
}
