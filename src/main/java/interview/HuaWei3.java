package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/9 15:11
 */
public class HuaWei3 {
    // 1,0,0,0,0,1,0,0,1,0,1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        int now = 0;
        int maxs = 0;
        boolean sign = true;
        char[] strs = new char[s.length() / 2 + 1];
        int index = 0;
        for (int i = 0; i < s.length(); i += 2) {
            strs[index++] = s.charAt(i);
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == '1') {
                if (sign) maxs = now;
                sign = false;
                max = Math.max(max, now);
                now = 0;
            } else {
                now++;
            }
        }
        int maxe = now;
        max = (max + 1) / 2;
        int result = Math.max(maxs, maxe);
        result = Math.max(result, max);
        System.out.println(result);
    }
}
