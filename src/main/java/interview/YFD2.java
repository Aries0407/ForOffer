package interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aries
 * @date 2021/7/31 20:09
 */
public class YFD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int cur = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ']') {
                int tmp = 0;
                if (i == chars.length - 1) {
                    cur += 1;
                } else if (i < chars.length - 1 && chars[i] != '[' && chars[i] != ']') {
                    tmp = chars[i] - '0';
                }
            } else {
                stack.push(chars[i]);
            }
        }
    }
}
