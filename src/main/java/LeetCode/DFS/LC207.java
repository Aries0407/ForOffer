package LeetCode.DFS;


import java.util.HashSet;

/**
 * @author Aries
 * @date 2021/5/1 9:28
 */
public class LC207 {
    HashSet<Integer> set = new HashSet<>();
    int[][] prerequisites;
    int numCourses = 0;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) return true;
        this.numCourses = numCourses;
        this.prerequisites = prerequisites;
        boolean ret = false;
        int cur = 0;
        for (int[] prerequisite : prerequisites) {
            set.add(prerequisite[0]);
            cur++;
            ret = dfs(cur, prerequisite[1]);
        }
        return ret;
    }

    private boolean dfs(int cur, int id) {
        if (cur == numCourses - 1) {
            return true;
        }
        for (int[] prerequisite : prerequisites) {
            if (prerequisite[0] == id) {
                if (set.contains(prerequisite[1])) {
                    return false;
                } else {
                    set.add(prerequisite[0]);
                    cur++;
                    return dfs(cur, prerequisite[1]);
                }
            }
        }
        return false;
    }
}
