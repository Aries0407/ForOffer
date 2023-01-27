package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/11 15:59
 */
public class MeiTuan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        int ncnt = str.length;
        int nbit = 1 << ncnt;
        int count = 0;
        int dd = String.valueOf(22).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbit; i++) {
            sb.delete(0, sb.length());
            for (int j = 0; j < ncnt; j++) {
                if ((i << (31 - j)) >> 31 == -1) {
                    sb.append(str[j]);
                }
            }
            String s1 = sb.toString();
            if (s1.length() >= dd && Integer.parseInt(s1) % 22 == 0) {
                count++;
                System.out.print(s1 + " ");
            }
        }
        System.out.println(count);
    }
}
