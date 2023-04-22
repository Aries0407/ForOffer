package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T39 {
    List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> list = new LinkedList<>();
        dfs(candidates, target, 0, 0, list);
        return lists;
    }

    private void dfs(int[] candidates, int target, int curSum, int curIndex, LinkedList<Integer> list) {
        if (curSum + candidates[curIndex] > target) {
            return;
        }
        if (curSum == target) {
            lists.add(new ArrayList<>(list));
        }
        for (int i = curIndex; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(candidates, target, curSum + candidates[i], i, list);
            list.removeLast();
        }
    }
}
