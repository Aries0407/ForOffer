package LeetCode;

import java.util.PriorityQueue;

/**
 * @author Aries
 * @date 2021/5/3 7:53
 */
public class LC7 {
    public int reverse(int x) {
        long ret = 0;
        long tmp = Math.abs(x);
        int i = 1;
        while (tmp != 0) {
            ret = (long) (ret * Math.pow(10, i) + (tmp % 10));
            tmp /= 10;
        }
        if (ret > Math.pow(2, 31) - 1 || ret < Math.pow(-2, 31)) {
            return 0;
        }
        if (x > 0) {
            return (int) ret;
        } else {
            return (int) -ret;
        }
    }

    /**
     * @author Aries
     * @date 2021/2/15 16:01
     */
    public static class LC215 {
        //优先队列,小根堆
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int num : nums) {
                if (queue.size() < k) {
                    queue.add(num);
                }
                if (queue.size() == k) {
                    if (queue.peek() > num) {
                        queue.poll();
                        queue.add(num);
                    }
                }
            }
            return queue.peek();
        }

        public int quickSort(int low, int high, int[] nums, int k) {
            if (low >= high) return nums[nums.length - k];
            int base = nums[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (nums[j] > base) j--;
                while (nums[i] < base) i++;
                if (i < j) {
                    swap(i, j, nums);
                }
            }
            nums[low] = nums[i];
            nums[i] = base;

            if (k < i) {
                quickSort(low, i, nums, k);
            } else if (k > i) {
                quickSort(i + 1, high, nums, k);
            } else {
                return nums[nums.length - k];
            }
            return nums[nums.length - k];
        }

        public void swap(int i, int j, int[] nums) {
            int temp = i;
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
