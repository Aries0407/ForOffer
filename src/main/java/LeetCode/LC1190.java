package LeetCode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Aries
 * @date 2021/4/14 20:42
 */
public class LC1190 {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> list = new LinkedList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != ')') stack.push(chars[i]);
            if (chars[i] == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    list.add(stack.pop());
                }
                stack.pop();
                while (!list.isEmpty()) {
                    stack.push(list.pollFirst());
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            if (stack.peek() != '(' && stack.peek() != ')') {
                sb.append(stack.pop());
            }
        }
        if (chars[0] != '(') sb.reverse();
        return sb.toString();
    }


    public static void main(String[] args) {
        LC1190 l = new LC1190();
        System.out.println(l.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
}
