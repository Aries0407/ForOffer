package LeetCode.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author Aries
 * @date 2021/5/2 19:33
 */
public class LC554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (wall.size() <= 0) return 0;
        int edge = 0;
        for (int i : wall.get(0)) {
            edge += i;
        }
        for (List<Integer> list : wall) {
            int len = 0;
            for (int i : list) {
                len += i;
                if (len == edge) break;
                map.put(len, map.getOrDefault(len, 0) + 1);
            }
        }
        int max = 0;
        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }
        return wall.size() - max;
    }
}
