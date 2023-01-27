package LeetCode.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aries
 * @date 2021/2/13 12:31
 */
public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int left;
        int right;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (i >= 1 && nums[i] == nums[i - 1]) continue;
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] > -x) {
                    right--;
                } else if (nums[left] + nums[right] < -x) {
                    left++;
                } else {
                    list.add(x);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(new ArrayList<>(list));
                    list.clear();
                    int leftValue = nums[left];
                    int rightValue = nums[right];
                    while (left < right && leftValue == nums[left]) {
                        left++;
                    }
                    while (left < right && rightValue == nums[right]) {
                        right--;
                    }
                }
            }
        }
        return lists;
    }
}
