package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T78 {

    //递归
    public List<List<Integer>> subsets(int[] nums) {
        return recur(nums.length, new ArrayList<>(), nums);
    }

    List<List<Integer>> recur(int cur, List<List<Integer>> lists, int[] nums) {
        if (cur == 0) {
            lists.add(new ArrayList<>());
            return lists;
        }
        recur(cur - 1, lists, nums);
        List<List<Integer>> temp = new ArrayList<>();
        for (List<Integer> list : lists) {
            temp.add(new ArrayList<>(list));
        }
        for (List<Integer> t : temp) {
            t.add(nums[cur - 1]);
            lists.add(new ArrayList<>(t));
        }
        return lists;
    }

}
