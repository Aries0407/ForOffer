package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2021/4/5 14:11
 */
public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, lists, path, used);
        return lists;
    }

    private void dfs(int[] nums, List<List<Integer>> lists, LinkedList<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            lists.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, lists, path, used);
            path.removeLast();
            used[i] = false;
        }
    }


}
