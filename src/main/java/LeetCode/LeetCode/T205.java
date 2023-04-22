package LeetCode.LeetCode;

import java.util.HashMap;

public class T205 {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if ((st.containsKey(x) && st.get(x) != y)
                    || (ts.containsKey(y) && ts.get(y) != x)) {
                return false;
            }
            st.put(x, y);
            ts.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
