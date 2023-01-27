package LeetCode.Heap;

import java.util.PriorityQueue;

/**
 * @author Aries
 * @date 2021/2/11 8:25
 */
public class LC703 {
    private static PriorityQueue<Integer> min;
    int k = 0;

    public LC703(int k, int[] nums) {
        this.k = k;
        min = new PriorityQueue<>();
        for (int i : nums) {
            min.add(i);
        }
    }

    public int add(int val) {
        min.add(val);
        while (k > min.size()) {
            min.poll();
        }
        return min.peek();
    }

    public static void main(String[] args) {

    }
}
