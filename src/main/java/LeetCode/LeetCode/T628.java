package LeetCode.LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class T628 {
    public int maximumProduct(int[] nums) {
        int ret = 1;
        Arrays.sort(nums);
        ret = Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        return ret;
    }
}
