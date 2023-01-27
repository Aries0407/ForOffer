package interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/7 19:43
 */
public class BaiDu1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int[][] ret = new int[n * k][n * k];
        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[i].length; j++) {
                ret[i][j] = nums[i/k][j/k];
            }
        }

        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[i].length; j++) {
                System.out.print(ret[i][j] + " ");
            }
            System.out.println();
        }
    }
}
