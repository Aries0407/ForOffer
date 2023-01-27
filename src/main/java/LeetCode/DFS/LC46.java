package LeetCode.DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2022/12/18 10:46
 */
public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, lists, path, visited);
        return lists;
    }

    public void dfs(int[] nums, List<List<Integer>> lists, LinkedList<Integer> path, boolean[] visited) {
        if (check(path, visited)) {
            lists.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            dfs(nums, lists, path, visited);
            path.removeLast();
            visited[i] = false;
        }
    }

    public boolean check(List<Integer> path, boolean[] used) {
        if (path.size() == used.length) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
