package LeetCode.LeetCode;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        helper(root, root);

        return false;
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }

    public static void main(String[] args) {

    }
}
