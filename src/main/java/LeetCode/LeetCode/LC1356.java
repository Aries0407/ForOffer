package LeetCode.LeetCode;

import java.util.*;

public class LC1356 {
    public static void main(String[] args) {
        LC1356 t1356 = new LC1356();
        int[] a = {100, 100};
        System.out.println(Arrays.toString(t1356.sortByBits(a)));
    }


    //暴力查找
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();  //存储数字和他的二进制总出现1的个数
        Map<Integer, Integer> countMap = new HashMap<>();     //存储重复出现的数字出现的个数
        for (int num : arr) {
            int temp = num;
            int count = 0;
            //统计数字的二进制中出现1的个数
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    count++;
                }
                temp >>= 1;
            }
            if (!treeMap.containsKey(num)) {
                treeMap.put(num, count);
            } else {
                if (!countMap.containsKey(num)) {
                    countMap.put(num, 2);
                } else {
                    countMap.put(num, countMap.get(num) + 1);
                }
            }
        }
        //使treeMap中按照value排序
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        int[] res = new int[arr.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            int num = e.getKey();
            res[index++] = num;
            if (countMap.containsKey(num)) {
                int count = countMap.get(num) - 1;
                while (count != 0) {
                    res[index++] = num;
                    count--;
                }
            }
        }
        return res;
    }


    public int[] sortByBits1(int[] arr) {
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.bitCount(arr[i]) * 100000 + arr[i];
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] % 100000;
        }
        return num;
    }

}
