package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/12 18:40
 */
public class DiDi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            char c1 = list.get(i);
            char c2 = list.get(i + 1);
            if ((c1 == '0' && c2 == '1') || (c1 == '2' && c2 == '3')) {
                list.remove(i);
                list.remove(i);
                count += 2;
                i = -1;
            }
            if (list.size() <= 1) {
                break;
            }
        }
        System.out.println(count);
    }
}
