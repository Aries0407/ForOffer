package interview;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/8/31 19:01
 */
public class PDD11 {
    /*

2
3 4 1
5 2 3
1 2 9 7
3 4 1
5 2 3
1 2 9 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> queue1 = new PriorityQueue<>();
            PriorityQueue<Integer> queue2 = new PriorityQueue<>();
            for (int j = 0; j < n; j++) {
                queue1.add(sc.nextInt());
            }
            for (int j = 0; j < m; j++) {
                queue2.add(sc.nextInt());
            }
            System.out.println(queue1);
            System.out.println(queue2);

            int count = 0;
            while (!queue1.isEmpty() && !queue2.isEmpty()) {
                if (Math.abs(queue1.peek() - queue2.peek()) <= k) {
                    queue1.poll();
                    queue2.poll();
                    count++;
                } else {
                    int a = queue1.peek() > queue2.peek() ? queue2.poll() : queue1.poll();
                }
            }
            System.out.println(count);
        }
    }
}
