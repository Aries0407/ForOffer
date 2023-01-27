package demo;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/19 19:36
 */
public class HuaWei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length() - 1);
        String[] strings = s.split(",");
        int[] nums = new int[strings.length];
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
            p.add(nums[i]);
        }
        int ans = 0;
        while (p.size() > 1) {
            int a = p.poll();
            int b = p.poll();
            ans += a + b;
            p.add(a + b);
        }
        System.out.println(ans);
    }
}
