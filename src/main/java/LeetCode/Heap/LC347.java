package LeetCode.Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Aries
 * @date 2021/2/20 22:45
 */
public class LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 1) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (Integer i : map.keySet()) {
            int[] temp = new int[2];
            temp[0] = i;
            temp[1] = map.get(i);
            queue.add(temp);
        }
        int count = 0;
        int[] ret = new int[k];
        while (count < k) {
            ret[count++] = queue.poll()[0];
        }
        return ret;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        System.out.println(map.putIfAbsent(1, 2));
    }
}
