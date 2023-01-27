package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/4 10:16
 */
public class MeiTuan3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String pattern = k + "";
        LinkedList<Integer> head = new LinkedList<>();
        LinkedList<Integer> tail = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int j = 1; j <= Math.sqrt(a); j++) {
                if (a % j == 0){
                    head.addLast(j);
                    tail.addFirst(a/j);
                }
            }
            while (!head.isEmpty()){
                sb.append(head.pollFirst());
            }
            while (!tail.isEmpty()){
                sb.append(tail.pollFirst());
            }
            if (sb.toString().contains(pattern)){
                count++;
            }
        }

        System.out.println(count);

    }
}
