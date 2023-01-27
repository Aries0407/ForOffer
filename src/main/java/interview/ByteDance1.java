package interview;

import java.util.Arrays;
import java.util.Stack;

public class ByteDance1 {
    /*
    根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。
    如果之后都不会升高，请输入 0 来代替。

    例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
    你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     */
    public static void main(String[] args) {
        ByteDance1 byteDance1 = new ByteDance1();
        byteDance1.method2();

    }

    public void method2() {
        Stack<Integer> stack = new Stack<>();
        int[] a = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            while (!stack.empty() && a[i] > a[stack.peek()]) {
                int index = stack.pop();
                ret[index] = i - index;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(ret));
    }

    public void method1() {
        int[] a = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    ret[i] = j - i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ret));
    }
}
