package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T46 {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        LinkedList<Integer> path = new LinkedList<>();
        dfs(nums, len, 0, used, path, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, boolean[] used,
                     LinkedList<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, used, path, res);
            used[i] = false;
            path.removeLast();
        }
    }

}
