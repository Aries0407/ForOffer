package LeetCode.WeeklyCompetition;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WC5663 {
    public int kthLargestValue(int[][] matrix, int k) {
        int max = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 2; j++) {
                max = Math.max(max, matrix[i][0] ^ matrix[i][1]);
                queue.add(max);
            }
        }
        for (int i = 0; i < k ; i++) {
            max = queue.poll();
        }
        return max;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        queue.add(2);
        queue.add(5);
        queue.add(-1);
        System.out.println();
    }
}
