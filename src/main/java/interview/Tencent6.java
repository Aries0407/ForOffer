package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/18 19:52
 */
public class Tencent6 {

    private static boolean help(String a, String b) {
        if (a == null && b == null) return true;
        if (a.length() % 2 == 1) {
            return a.equals(b);
        }
        boolean f1 = help(a.substring(0, a.length() / 2), b.substring(0, b.length() / 2))
                && help(a.substring(a.length() / 2), b.substring(b.length() / 2));
        if (f1) return true;

        boolean f2 = help(a.substring(0, a.length() / 2), b.substring(b.length() / 2))
                && help(a.substring(a.length() / 2), b.substring(0, b.length() / 2));

        return f2 || f1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] strs = new String[n][2];
        for (int i = 0; i < n; i++) {
            strs[i][0] = sc.nextLine();
            strs[i][1] = sc.nextLine();
            if (help(strs[i][0], strs[i][1])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
