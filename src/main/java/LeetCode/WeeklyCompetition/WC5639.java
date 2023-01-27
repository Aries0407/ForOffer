package LeetCode.WeeklyCompetition;

import java.util.Arrays;
import java.util.PriorityQueue;

public class WC5639 {
    public static int minimumTimeRequired(int[] jobs, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(0);
        }
        Arrays.sort(jobs);
        for (int i = jobs.length - 1; i >= 0; i--) {
            int temp = queue.poll();
            temp += jobs[i];
            queue.add(temp);
        }
        int ret = 0;
        while (!queue.isEmpty()) {
            ret = Math.max(ret, queue.poll());
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] jobs = {38,49,91,59,14,76,84};
        int k = 3;
        System.out.println(WC5639.minimumTimeRequired(jobs, k));
    }
}
