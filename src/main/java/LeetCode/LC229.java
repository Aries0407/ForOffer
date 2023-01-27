package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author Aries
 * @date 2022/11/5 23:23
 */
public class LC229 {

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = nums.length / 3;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> set = new ArrayList<>();
        for (int key : map.keySet()) {
            if (!set.contains(key) && map.get(key) > count) {
                set.add(key);
            }
        }
        return set;
    }


    public static void main(String[] args) {

    }
}
