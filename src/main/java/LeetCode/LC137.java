package LeetCode;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/4/30 15:52
 */
public class LC137 {
    public static void main(String[] args) {
        int i = 2;
        i = i | 1;
        System.out.println(i);
    }

    //位运算
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                count[i] += num & 1;
                num = num >>> 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            count[31 - i] %= 3;
            res <<= 1;
            res |= count[31 - i];
        }
        return res;
    }


    //哈希表
    public int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
