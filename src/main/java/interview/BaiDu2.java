package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/7 19:59
 */
public class BaiDu2 {

    public static String fun(String s) {
        char[] ca = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int jiewei = 0;
        for (int i = ca.length - 1; i >= 0; i--) {
            if (ca[i] == '0') {
                jiewei = 1;
                ca[i] = '3';
            } else if (ca[i] - (char) jiewei > '3') {
                jiewei = 0;
                ca[i] = '3';
            } else if (ca[i] - (char) jiewei <= '0') {
                ca[i] = '0';
            }
        }

        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != '0') {
                sb.append(ca[i]);
            }
        }
        return sb.toString();
    }


    private int i;

    private void t() {
        i = 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }


        System.out.println();
    }
}
