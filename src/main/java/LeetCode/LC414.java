package LeetCode;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author Aries
 * @date 2021/10/6 15:38
 */
public class LC414 {
    public int thirdMax(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {};
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        nums = new int[set.size()];
        int index = 0;
        for (int i : set) {
            nums[index++] = i;
        }
    }
}
