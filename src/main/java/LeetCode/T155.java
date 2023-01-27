package LeetCode;

import java.util.Stack;

public class T155 {
    Stack<Integer> stack;
    Stack<Integer> min;
    int anInt = Integer.MIN_VALUE;

    public T155() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.empty()) {
            min.push(x);
        } else if (x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        if (stack.pop() == min.peek()){
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
