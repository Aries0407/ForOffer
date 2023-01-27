package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Aries
 * @date 2021/5/19 18:48
 */
public class HuaWei {

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 1; i <= 9; i++) {
            p.add(i);
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

