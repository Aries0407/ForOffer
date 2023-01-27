package NiuKe;

import java.util.ArrayList;
import java.util.Arrays;

public class JZ29 {

    /*
    牛客网剑指offeer第29题
    输入n个整数，找出其中最小的K个数。
    例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
    done
     */


    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k == 0 || k > input.length) return list;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        JZ29 jz = new JZ29();
        int[] a = {4, 5, 1, 6, 2, 7, 3, 8};
        jz.GetLeastNumbers_Solution(a, 4);
    }
}
