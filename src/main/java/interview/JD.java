package interview;

import java.util.Stack;

/**
 * @author Aries
 * @date 2021/9/10 19:52
 */
public class JD {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public static void main(String[] args) {
        JD j = new JD();
        j.put(1);
        j.put(2);
        j.put(3);
        System.out.println(j.pop());
        System.out.println(j.pop());
        j.put(4);
        j.put(5);
        System.out.println(j.pop());
    }

    public void put(int i) {
        while (!out.isEmpty()) {
            in.add(out.pop());
        }
        in.add(i);
    }

    public int pop() {
        while (!in.isEmpty()) {
            out.add(in.pop());
        }
        return out.pop();
    }
}
