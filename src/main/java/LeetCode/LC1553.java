package LeetCode;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/3/22 14:28
 */
public class LC1553 {


    HashMap<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        return getMin(n);
    }

    private int getMin(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 2;
        Integer i = map.get(n);
        if (i != null) return i;
        int m1 = getMin(n / 2) + n % 2;
        int m2 = getMin(n / 3) + n % 3;
        int ret = Math.min(m1, m2) + 1;
        map.put(n, ret);
        return ret;
    }

}
