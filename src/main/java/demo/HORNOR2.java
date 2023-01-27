package demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/23 16:16
 */
public class HORNOR2 {
    /*
11
10 20 30 5 10 11 15 21 15 16 17
     */

    public static boolean isPrime(int num) {
        if(num == 2) return true;//2特殊处理
        if(num < 2 || num % 2 == 0) return false;//识别小于2的数和偶数
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){//识别被奇数整除
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int ret = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i + 1)) {
                Arrays.sort(nums, 0,i + 1);
                ret += nums[count];
                count++;
            }
        }
        System.out.println(ret);
    }
}
