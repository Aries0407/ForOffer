package NiuKe;

import java.util.Arrays;
import java.util.LinkedList;

public class JZ46 {


    //方法二：利用linkedlist实现循环链表
    public int LastRemaining_Solution2(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        if (n <= 0 || m < 0) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int out = 0;
        int size = list.size();
        while (list.size() > 1) {
            out = (out + m - 1) % size;
            list.remove(out % size);
            size--;
        }
        return list.get(0);
    }

    //方法一：利用数组实现循环链表
    public int LastRemaining_Solution(int n, int m) {
        int res = 0;
        if (n <= 0 || m < 0) {
            return -1;
        }
        int a[] = new int[n];
        Arrays.fill(a, 1);
        int out = 0;
        int count = 0;
        for (int i = 0; ; i++, i %= n) {
            if (a[i] == 1) {
                count++;
            }
            if (count == m) {
                a[i] = 0;
                out++;
                count = 0;
                for (int j = (i + 1) % n; ; j++, j %= n) {
                    if (a[j] == 1) {
                        i = j - 1;
                        break;
                    }
                }
            }
            if (out == n - 1) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        JZ46 jz46 = new JZ46();
        System.out.println(jz46.LastRemaining_Solution2(5, 3));
    }
}
