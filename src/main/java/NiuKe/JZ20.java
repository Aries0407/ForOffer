package NiuKe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class JZ20 {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /*
    定义栈的数据结构，
    请在该类型中实现一个能够得到栈中所含最小元素的min函数
    （时间复杂度应为O（1））。
     */

    /*
    使用辅助栈：
    每添加一个元素，则判断该元素是否比辅助栈顶元素小,是则该元素进栈的同时也进辅助栈，否则只进栈；
    出栈时，判断栈顶元素是否与辅助栈顶元素相同，是则两个栈都执行pop操作，否则只有辅助栈不执行pop操作
    s:   3 4 2 3 0
    min: 3   2   0
     */
    public void push(int node) {
        if (min.empty()) {
            min.push(node);
            s.push(node);
        }
        if (min.peek() >= node) {
            min.push(node);
        }
        s.push(node);
    }

    public void pop() {
        int tmp = s.pop();
        if (tmp == min.peek()) {
           min.pop();
        }
    }

    public int top() {

        return s.peek();
    }

    public int min() {
        return min.peek();
    }

    public static void main(String[] args) {
        JZ20 jz20 = new JZ20();
        jz20.push(3);
        System.out.println(jz20.min());
        jz20.push(4);
        System.out.println(jz20.min());
        jz20.push(2);
        System.out.println(jz20.min());
        jz20.push(3);
        System.out.println(jz20.min());
        jz20.pop();
        System.out.println(jz20.min());
        jz20.pop();
        System.out.println(jz20.min());
        jz20.pop();
        System.out.println(jz20.min());
        jz20.push(0);
        System.out.println(jz20.min());
    }
}
