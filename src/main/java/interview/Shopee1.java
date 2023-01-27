package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aries
 * @date 2021/9/3 10:46
 */
public class Shopee1 {

    public static int judge(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) return 0;
            i++;
            j--;
        }
        return 1;
    }

    public static String toHexString(int n) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i + "");
        }
        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");

        int i = n;
        int yushu = 0;
        String ret = "";
        Stack<Integer> stack = new Stack<>();
        while (i > 0) {
            yushu = i % 16;
            i /= 16;
            stack.add(yushu);
        }

        while (!stack.isEmpty()) {
            ret = map.get(stack.peek()) + ret;
            n %= 16;
            stack.pop();
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = toHexString(n);
        int ret = judge(s);
        System.out.println(ret);
    }
}
