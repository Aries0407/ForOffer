package LeetCode.LeetCode;

import java.util.Stack;

public class T394 {
    public String decodeString(String s) {
        String res = "";
        Stack<Character> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (s.charAt(i) == ']') {
                //取出括号里的内容
                stack.pop();
                String temp = "";
                while (stack.peek() != '[') {
                    temp = stack.pop() + temp;
                }
                stack.pop();
                //取出括号前的数字
                int count = 0;
                int j = 0;
                while (!stack.isEmpty() && (stack.peek() - '0' >= 0 && stack.peek() - '9' <= 0)) {
                    count += Math.pow(10, j);
                    j++;
                }
                //
                while (count != 0) {
                    temp += temp;
                    count--;
                }
                //把解码结果放入栈
                for (int k = 0; k < temp.length(); k++) {
                    stack.push(temp.charAt(k));
                }
            }
        }
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }


}
