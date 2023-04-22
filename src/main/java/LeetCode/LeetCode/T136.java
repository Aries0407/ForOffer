package LeetCode.LeetCode;

import java.util.HashMap;

public class T136 {

    //位运算
    public static int singleNumber(int[] nums){
        int ret = 0;
        for (int i : nums){
            ret ^= i;
        }
        return ret;
    }

    //哈希表
    public static int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int []nu = {4,1,2,1,2};
        System.out.println(T136.singleNumber(nu));
    }

}
