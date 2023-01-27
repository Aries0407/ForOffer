package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/18 19:06
 */
public class WY11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int count = 0;
        while (tmp != 0) {
            int chushu = tmp % 10;
            if (chushu == 0) {
                tmp /= 10;
                continue;
            }
            if (n % chushu == 0) count++;
            tmp /= 10;
        }
        System.out.println(count);
    }
}
