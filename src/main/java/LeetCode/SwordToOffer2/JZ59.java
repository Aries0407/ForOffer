package LeetCode.SwordToOffer2;

import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Aries
 * @date 2021/8/8 19:30
 */
public class JZ59 {

    //单调队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] ret = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!list.isEmpty() && nums[i] > nums[list.peekLast()]) {
                list.pollLast();
            }
            list.add(i);
        }
        int index = 0;
        ret[index++] = nums[list.peekFirst()];

        for (int i = k; i < nums.length; i++) {
            if (i - k == list.peekFirst()){
                list.pollFirst();
            }
            while (!list.isEmpty() && nums[i] > nums[list.peekFirst()]) {
                list.pollLast();
            }
            list.add(i);
            ret[index++] = nums[list.peekFirst()];

        }
        return ret;
    }

    //优先队列
    public int[] maxSlidingWindow1(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        for (int i = 0; i < k; i++) {
            int[] tmp = new int[]{nums[i], i};
            queue.add(tmp);
        }
        int[] ret = new int[nums.length - k + 1];
        ret[0] = queue.peek()[0];

        for (int i = k; i < nums.length; i++) {
            queue.add(new int[]{nums[i], i});
            while (queue.peek()[1] <= i - k) {
                queue.poll();
            }
            ret[i - k + 1] = queue.peek()[0];
        }
        return ret;

    }

    public static void main(String[] args) {

    }
}
