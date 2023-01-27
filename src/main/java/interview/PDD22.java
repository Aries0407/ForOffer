package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/8/31 20:03
 */
public class PDD22 {

    public int judge(char[] c1, char[] c2) {
        int len1 = c1.length;
        int len2 = c2.length;
        int len = Math.min(len1, len2);
        for (int i = 0; i < len; i++) {
            if (c1[i] > c2[i]) {
                return 1;
            }
        }
        if (len1 == len2) return 2;
        if (len1 < len2) return 0;
        else return 1;
    }

    public void swap(int i, int j, char[] chars) {
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }

    public int judge(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] t1 = Arrays.copyOf(c1, c1.length);
        char[] t2 = Arrays.copyOf(c2, c2.length);
        Arrays.sort(t1);
        for (int i = 0, j = t2.length - 1; i < j; i++, j--) {
            if (t2[i] < t2[j]) {
                swap(i, j, t2);
            }
        }
        if (judge(t1, t2) == 0) {

        }

        Arrays.sort(c2);

        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
    }
}
