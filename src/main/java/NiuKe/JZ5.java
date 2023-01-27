package NiuKe;

import java.util.Stack;

public class JZ5 {
    /*
    用两个栈实现队列  done
     */


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack1.size()==0){
            stack1.push(node);
            return;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
         return stack1.pop();
    }

    public static void main(String[] args) {

    }
}
