package LeetCode.LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LC17 {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new LinkedList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> list = new LinkedList<>();
        dfs(list, map, digits, "", 0);
        return list;
    }

    private void dfs(List<String> list, HashMap<Character, String> map, String digits, String combination,
                     int index) {
        if (combination.length() == digits.length()) {
            list.add(combination);
        } else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                dfs(list, map, digits, combination + letters.charAt(i), index + 1);
            }
        }
    }
}
