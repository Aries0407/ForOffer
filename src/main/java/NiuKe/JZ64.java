package NiuKe;

import java.util.ArrayList;

public class JZ64 {
    /*
    给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
    例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
    他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
     {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
     {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    窗口大于数组长度的时候，返回空
     */

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (size == 0) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length - size + 1; i++) {
            int max = num[i];
            for (int j = i; j < i + size; j++) {
                if (max < num[j]) {
                    max = num[j];
                }
            }

            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        JZ64 jz64 = new JZ64();
        System.out.println(jz64.maxInWindows(num, k));
    }
}
