package interview;

import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/7/25 19:05
 */
/*
4
1 3
4 5
7 10
13 18

 */
public class PDD1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int[][] nums = new int[L][2];
        for (int i = 0; i < L; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        int left = nums[0][0];
        int right = nums[0][1];
        for (int i = 0; i < L; i++) {
            for (int j = i + 1; j < L; j++) {
                if (nums[j][0] >= left && nums[j][1] <= right){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
