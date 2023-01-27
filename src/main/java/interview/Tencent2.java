package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/3/21 20:59
 */
public class Tencent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        int[] ret = new int[t];
        for (int i = 0; i < t; i++) {
            while (nums[i] != 0) {
                if (nums[i] % 3 == 1) {
                    nums[i]--;
                } else if (nums[i] % 3 == 0) {
                    nums[i] /= 3;
                } else if (nums[i] % 2 == 0) {
                    nums[i] /= 2;
                }
                count++;
            }
            ret[i] = count;
            count = 0;
        }
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
