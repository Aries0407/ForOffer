package LeetCode.LeetCode;


import java.util.ArrayList;
import java.util.List;

public class T129 {


    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        dfs(root, sb, list);
        for (int i:list){
            sum+=i;
        }
        return sum;
    }

    private void dfs(TreeNode root, StringBuffer sb, List<Integer> list) {
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            list.add(Integer.valueOf(sb.toString()));
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(root.val);
        if (root.left != null) dfs(root.left, sb, list);
        if (root.right != null) dfs(root.right, sb, list);
        sb.deleteCharAt(sb.length() - 1);
    }
}
