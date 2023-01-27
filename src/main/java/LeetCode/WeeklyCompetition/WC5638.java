package LeetCode.WeeklyCompetition;

import java.util.*;

public class WC5638 {

    public static int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o1[1] < o2[1] ? -1 : 1));
        int ret = 0;
        for (int i = 0; i < apples.length || queue.size() > 0; i++) {
            //去掉过期的
            while (!queue.isEmpty()) {
                int[] num = queue.peek();
                if (num[1] <= i) {
                    queue.poll();
                } else {
                    break;
                }
            }

            //添加新苹果
            if (i < apples.length && apples[i] > 0) {
                queue.add(new int[]{apples[i], days[i] + i});
            }
            //吃苹果
            int[] num = queue.peek();
            if (num != null && num[0] > 0) {
                ret++;
                num[0] -= 1;
                if (num[0] == 0) {
                    queue.poll();
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] apples = {1, 2, 3, 5, 2};
        int[] days = {3, 2, 1, 4, 2};
        System.out.println(WC5638.eatenApples(apples, days));
    }

}
