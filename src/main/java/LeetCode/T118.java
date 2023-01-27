package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T118 {
    public static void main(String[] args) {
        T118.generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>(numRows);
        for (int i = 0; i < 2; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(1);
            }
            lists.add(list);
        }
        if (numRows < 2) {
            if (numRows == 1) {
                lists.remove(1);
                return lists;
            }
            return lists;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> temp = lists.get(i - 1);
            list.add(1);
            for (int j = 1; j < temp.size(); j++) {
                list.add(temp.get(j - 1) + temp.get(j));
            }
            list.add(1);
            lists.add(list);
        }
        System.out.println(lists.toString());
        return lists;
    }
}
