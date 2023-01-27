package LeetCode;

import java.util.*;

/**
 * @author Aries
 * @date 2021/2/20 9:07
 */
public class LC697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                int[] temp = new int[3];
                temp[0]++;
                temp[1] = i;
                temp[2] = i;
                map.put(nums[i], temp);
            }
        }
        int max = 0;
        int minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int key = entry.getKey();
            int[] temp = entry.getValue();
            if (temp[0] > max) {
                max = temp[0];
                minLen = temp[2] - temp[1] + 1;
            } else if (temp[0] == max) {
                if (minLen > temp[2] - temp[1] + 1) {
                    minLen = temp[2] - temp[1] + 1;
                }
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        LC697 lc697 = new LC697();
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(lc697.findShortestSubArray(nums));
    }

}
