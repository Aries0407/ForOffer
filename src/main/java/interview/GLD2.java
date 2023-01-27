package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/21 20:22
 */
public class GLD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        ArrayList<Character> list = new ArrayList<>();
        int rl = 0;
        int rh = strs.length - 1;
        int cl = 0;
        int ch = strs[0].length() - 1;
        while (true) {
            for (int i = cl; i <= ch; i++) {
                if (strs[rl].charAt(i) != '0')
                    list.add(strs[rl].charAt(i));
            }
            if (++rl > rh) break;
            for (int i = rl; i <= rh; i++) {
                if (strs[i].charAt(ch) != '0')
                    list.add(strs[i].charAt(ch));
            }
            if (--ch < cl) break;
            for (int i = ch; i >= cl; i--) {
                if (strs[rh].charAt(i) != '0')
                    list.add(strs[rh].charAt(i));
            }
            if (--rh < rl) break;
            for (int i = rh; i >= rl; i--) {
                if (strs[i].charAt(cl) != '0')
                    list.add(strs[i].charAt(cl));
            }
            if (++cl > ch) break;
        }
        for (char c : list) {
            System.out.print(c);
        }
    }
}
