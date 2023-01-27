package LeetCode.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Aries
 * @date 2021/2/21 8:48
 */
public class LC1438 {

    //滑动窗口+有序队列
    public int longestSubarray1(int[] nums, int limit) {

        return 0;
    }

    //滑动窗口+有序集合
    public int longestSubarray(int[] nums, int limit) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        while (right < nums.length) {
            treeMap.put(nums[right], treeMap.getOrDefault(nums[right], 0) + 1);
            while (treeMap.lastKey() - treeMap.firstKey() > limit) {
                treeMap.put(nums[left], treeMap.get(nums[left]) - 1);
                if (treeMap.get(nums[left]) == 0) {
                    treeMap.remove(nums[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
