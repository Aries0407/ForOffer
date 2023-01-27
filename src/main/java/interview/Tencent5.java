package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aries
 * @date 2021/4/4 20:10
 */
public class Tencent5 {

    public void test() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = sc.nextLine();
        Stack<Integer> stk = new Stack<>();
        stk.push(b.charAt(0) - '0');
        for (int i = 1; i < b.length(); i++) {
            if (!stk.isEmpty()) {
                int num = stk.peek();
                if (num == 10 - (b.charAt(i) - '0')) {
                    stk.pop();
                } else {
                    stk.push(b.charAt(i) - '0');
                }
            } else {
                stk.push(b.charAt(i) - '0');
            }
        }
        System.out.println(stk.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < b.length(); i++) {
            list.add(b.charAt(i));
        }
        for (int i = 1; i < list.size(); i++) {
            if (i == 0) continue;
            int num1 = Integer.parseInt(String.valueOf(list.get(i)));
            int num2 = Integer.parseInt(String.valueOf(list.get(i - 1)));
            if (num1 + num2 == 10) {
                list.remove(i);
                list.remove(i - 1);
                if (i >= 1) {
                    i -= 2;
                }
            }
        }
        System.out.println(list.size());
        Tencent5 tencent5 = new Tencent5();
        tencent5.test();
    }
}
