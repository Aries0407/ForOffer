package interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/13 19:16
 */
public class XieCheng2 {
    void test() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        while (sc.hasNext()) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            list.add(nums);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((Comparator.comparingInt(o -> o[0])));


    }
}
