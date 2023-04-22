package LeetCode.LeetCode;

import java.util.HashMap;

public class T389 {

    public char findTheDifference(String s, String t) {
        char ret = ' ';
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), 1);
            } else {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), 1);
            } else {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
        }
        for (Character c : tMap.keySet()) {
            if (!sMap.containsKey(c) || tMap.get(c) > sMap.get(c)) {
                ret = c;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
