package LeetCode.SwordToOffer;

import java.util.*;

public class JZ38 {

    List<String> list = new ArrayList<>();
    char[] chars;

    public String[] permutation(String s) {
        chars = s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }

    private void dfs(int index) {
        if (index == chars.length - 1) {
            list.add(String.valueOf(chars));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (set.contains(chars[i])) continue;
            set.add(chars[i]);
            swap(index, i);
            dfs(index + 1);
            swap(index, i);
        }
    }

    public void swap(int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    public String[] permutation1(String s) {
        char[] schar = s.toCharArray();
        List<LinkedList<Character>> lists = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        boolean[] used = new boolean[s.length()];
        Arrays.sort(schar);
        dfs1(schar, lists, list, used);
        String[] ret = new String[lists.size()];
        int index = 0;
        for (List<Character> t : lists) {
            String re = "";
            for (char c : t) {
                re += c;
            }
            ret[index++] = re;
        }
        return ret;
    }

    private void dfs1(char[] schar, List<LinkedList<Character>> lists, LinkedList<Character> list, boolean[] used) {
        if (list.size() == schar.length){
            lists.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < schar.length; i++) {
            if (used[i]||(i > 0 && schar[i] == schar[i-1] && !used[i])) continue;
            used[i]= true;
            list.add(schar[i]);
            dfs1(schar, lists, list, used);
            used[i] = false;
            list.removeLast();
        }
    }

}
