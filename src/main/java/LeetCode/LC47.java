package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2021/5/5 9:31
 */
public class LC47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        dfs(nums, lists, path, used);
        return lists;
    }

    private void dfs(int[] nums, List<List<Integer>> lists, LinkedList<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            lists.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, lists, path, used);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(1, null);
        System.out.println(map.get(1));
    }
}
