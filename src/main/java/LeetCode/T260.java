package LeetCode;

import java.util.ArrayList;
import java.util.TreeMap;

public class T260 {
    /*
    一个整型数组里除了两个数字之外，其他的数字都出现了两次。
    请写程序找出这两个只出现一次的数字。
     */
    public int[] singleNumber(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int val = map.get(nums[i]) + 1;
                map.put(nums[i], val);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                list.add(key);
            }
        }
        int ints[] = list.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    public static void main(String[] args) {
        T260 t = new T260();
        int a[] = {1, 2, 1, 3, 2, 5};
        t.singleNumber(a);
    }
}
