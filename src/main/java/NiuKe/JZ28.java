package NiuKe;

import java.util.*;

public class JZ28 {
    /*
    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
    由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        int res = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int value = map.get(array[i]);
                map.put(array[i], value + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > array.length / 2) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        JZ28 jz28 = new JZ28();
        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(jz28.MoreThanHalfNum_Solution(a));
    }
}
