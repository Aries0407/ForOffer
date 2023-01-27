package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/8/22 10:50
 */
public class MT1 {

    public static int getLen(String s, char c, int loc) {

        int i = loc - 1;
        int j = loc + 1;
        while (i >= 0 || j < s.length()) {
            if (i >= 0 && s.charAt(i) == c) {
                return loc - i;
            } else if (j < s.length() && s.charAt(j) == c) {
                return j - loc;
            } else {
                i--;
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int flag = sc.nextInt();
            int loc;
            if (flag == 2) {
                loc = sc.nextInt();
                int ret = getLen(s, s.charAt(loc - 1), loc - 1);
                System.out.println(ret);
            } else {
                s += sc.next();
            }
        }
    }
}
