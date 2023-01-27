package LeetCode;

import java.util.HashMap;

public class T290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (strings.length!=pattern.length()) return false;
        HashMap<String, Character> sc = new HashMap<>();
        HashMap<Character, String> cs = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!sc.containsKey(strings[i])) {
                sc.put(strings[i], pattern.charAt(i));
            } else {
                if (!(sc.get(strings[i]) == pattern.charAt(i))) {
                    return false;
                }
            }
            if (!cs.containsKey(pattern.charAt(i))) {
                cs.put(pattern.charAt(i), strings[i]);
            } else {
                if (!(cs.get(pattern.charAt(i)) .equals(strings[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(T290.wordPattern("aaaa", "dog cat cat dog"));
    }
}
