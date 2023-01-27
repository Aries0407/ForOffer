package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ByteDance2 {
    /*
    输入一个整型数组，包含正整数、负整数和0，无序，无重复。要求查找第一个缺失的正整数。
    Example 1:
    Input: [1,2,0]
    Output: 3
    Example 2:
    Input: [3,4,-1,1]
    Output: 2
    Example 3:
    Input: [7,8,9,11,12]
    Output: 1
     */
    public static void main(String[] args) {
        ByteDance2 byteDance2 = new ByteDance2();
        byteDance2.method2();

    }

    public void method2() {
        int[] a = {2,1};

        boolean has1 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                has1 = true;
                break;
            }
        }
        if (!has1) return;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 1 || a[i] > a.length) {
                a[i] = 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            int index = Math.abs(a[i]) - 1;
            a[index] = -Math.abs(a[index]);
        }

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public void method1() {
        int[] a = {1, 2, 0};
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i = 1; i <= set.size(); i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}