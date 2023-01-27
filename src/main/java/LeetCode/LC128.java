package LeetCode;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/4/22 9:34
 */
public class LC128 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;

    public LC128(HashMap<Integer, Integer> map, int[] nums) {
        for (int num : nums) {
            map.put(num, -1);
        }
        this.count = nums.length;
    }
}
