package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/8 20:39
 */
public class BeiKe4 {

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static int[] bs(int[] nums, int avg) {
        int[] ret = new int[2];
        for (int i : nums) {
            if (i > avg) ret[0] += i;
            else ret[1] += i;
        }
        return ret;
    }


    public static int averge(int[] nums) {
        int k = nums.length;
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ask = new int[q];
        String[] s = new String[q];
        Arrays.sort(nums);


        for (int i = 0; i < q; i++) {
            ask[i] = sc.nextInt();
            boolean flag = true;
            while (true){
                if (sum(nums)>ask[i]){

                }
                break;
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(s[i]);
        }


    }
}
