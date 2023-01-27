package LeetCode.SwordToOffer2;

import java.util.*;

/**
 * @author Aries
 * @date 2021/8/15 8:49
 */
public class JZ003 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if (!map.containsKey(s)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                lists.add(list);
                map.put(s, lists.size() - 1);
            } else {
                lists.get(map.get(s)).add(strs[i]);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        char[] c = {'2', '3'};
        System.out.println(String.valueOf(c));
    }

}
