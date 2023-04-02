package LeetCode.SwordToOffer;

import java.util.HashMap;

public class JZ56_2 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        int res = 0;
        for (int x : map.keySet()) {
            if (map.get(x)==1){
                res = x;
            }
        }
        return res;
    }
}
