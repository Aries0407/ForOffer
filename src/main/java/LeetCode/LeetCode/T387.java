package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class T387 {
    public static int firstUniqChar(String s) {
        int index = 0;
        int ret = -1;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                list.add(index);
                map.put(s.charAt(i), 1);
            }
            index++;
        }
        int index2 = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                ret = list.get(index2);
                break;
            }
            index2++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(T387.firstUniqChar("dddccdbba"));
    }
}
