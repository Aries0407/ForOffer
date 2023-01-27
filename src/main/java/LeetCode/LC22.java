package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(n, sb, res, 0, 0);
        return res;
    }

    private void dfs(int n, StringBuilder path, ArrayList<String> res, int left, int right) {

        if (path.length() == 2 * n) {
            res.add(path.toString());
            return;
        }
        if (left < n) {
            path.append("(");
            dfs(n, path, res, left + 1, right);
            path.deleteCharAt(path.length() - 1);
        }
        if (right < left) {
            path.append(")");
            dfs(n, path, res, left, right + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }

}
