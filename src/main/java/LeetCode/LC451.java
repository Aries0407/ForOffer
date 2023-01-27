package LeetCode;

import java.util.*;

/**
 * @author Aries
 * @date 2022/11/6 11:32
 */
public class LC451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.size());
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry : list){
            int count = entry.getValue();
            char key = entry.getKey();
            for (int i = 0; i < count; i++) {
                sb.append(key);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
