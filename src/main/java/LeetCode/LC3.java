package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LC3 {

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = map.get(c) + 1;
            }
            maxLen = Math.max(maxLen,i-left+1);
            map.put(c, i);
        }
        return maxLen;
    }

}
