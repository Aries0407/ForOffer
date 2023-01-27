package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/8/21 17:03
 */
public class DXM {

    public boolean judge(int[] count) {
        return count[0] >= 2 && count[11] >= 1 && count[7] >= 1 && count[14] >= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        if (cs.length < 5) {
            System.out.println(0);
        }
        int[] count = new int[26];
        for (int i = 0; i < 5; i++) {
            count[cs[i] - 'a']++;
        }

        for (int i = 5; i < cs.length; i++) {

        }

        System.out.println('h' - 'a');
    }
}
