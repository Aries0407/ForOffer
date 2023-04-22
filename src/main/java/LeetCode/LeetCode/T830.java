package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                start = i;
            }
            if ((i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) && i - start >= 2) {
                end = i;
                list.add(start);
                list.add(end);
                lists.add(list);
            }
        }
        return lists;
    }

    public static void main(String[] args) {

    }
}
