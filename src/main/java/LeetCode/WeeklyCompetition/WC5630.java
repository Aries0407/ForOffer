package LeetCode.WeeklyCompetition;


import java.util.HashSet;
import java.util.LinkedList;

public class WC5630 {


    public static int maximumUniqueSubarray(int[] nums) {
        int max = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                max = Math.max(max, sum);
                while (nums[left] != nums[i]) {
                    sum -= nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                left++;
            } else {
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        max = Math.max(max, sum);
        return max;
    }

    public static int maximumUniqueSubarray1(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int max = 0;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                max = Math.max(max, sum);
                list.add(nums[i]);
                while (nums[left] != nums[i]) {
                    sum -= list.poll();
                    left++;
                }
                list.poll();
                left++;
            } else {
                list.add(nums[i]);
                sum += nums[i];
            }
        }
        max = Math.max(sum, max);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 3, 2, 4, 1};
        System.out.println(WC5630.maximumUniqueSubarray1(nums));
    }

}
