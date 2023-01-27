package LeetCode.SwordToOffer2;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/8/15 9:50
 */
public class JZ034 {


    public boolean judge(String a, String b, HashMap<Character, Integer> map) {
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (map.get(a.charAt(i)) < map.get(b.charAt(j))) {
                return true;
            } else if (map.get(a.charAt(i)).equals(map.get(b.charAt(j)))) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return i >= a.length();
    }

    public boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length <= 1) return true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        int i = 0;
        int j = 1;
        while (j < words.length) {
            if (judge(words[i], words[j], map)) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"hello", "leetcode"};
        JZ034 jz034 = new JZ034();
        jz034.isAlienSorted(strings, "hlabcdefgijkmnopqrstuvwxyz");
    }
}
