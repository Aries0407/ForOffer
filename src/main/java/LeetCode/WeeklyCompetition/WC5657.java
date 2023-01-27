package LeetCode.WeeklyCompetition;

import java.util.HashMap;

public class WC5657 {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
