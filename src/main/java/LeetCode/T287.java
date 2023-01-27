package LeetCode;

import java.util.HashSet;

public class T287 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
