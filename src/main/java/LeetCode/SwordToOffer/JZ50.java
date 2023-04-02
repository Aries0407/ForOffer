package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class JZ50 {

    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) return c;
        }
        return ' ';
    }

    public char firstUniqChar1(String s) {
        if (s == "" || s == null) return " ".charAt(0);
        StringBuilder str = new StringBuilder(s);
        str = str.reverse();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String e = String.valueOf(str.charAt(i));
            if (list.contains(e)) {
                int index = list.indexOf(e);
                num.set(index, num.get(index) + 1);
            } else {
                list.add(e);
                num.add(1);
            }
        }

        int index = num.lastIndexOf(1);
        if (index == -1) {
            return " ".charAt(0);
        } else {
            char c = list.get(index).charAt(0);
            return c;
        }

    }

    public static void main(String[] args) {

    }
}
