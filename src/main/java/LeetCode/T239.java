package LeetCode;

import java.util.*;

public class T239 {


    public static int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] ret = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[i] > list.peekFirst()) {
                list.pollFirst();
            }
            list.addFirst(nums[i]);
            if (i >= k && nums[i - k ] == list.peekLast()) {
                list.pollLast();
            }
            if (i >= k - 1) {
                ret[i - k + 1] = list.peekLast();
            }
        }
        return ret;
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] ret = new int[nums.length - k + 1];
        for (int i = 0; i < k - 1; i++) {
            list.addLast(nums[i]);
        }
        for (int i = k - 1; i < nums.length; i++) {
            list.addLast(nums[i]);
            ret[i - k + 1] = Collections.max(list);
            list.pollFirst();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(T239.maxSlidingWindow(nums, 3)));
    }
}
