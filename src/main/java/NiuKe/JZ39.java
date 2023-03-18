package NiuKe;


public class JZ39 {
    /*
    输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
     */

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        int res = Math.abs(leftTree(root.left) - rightTree(root.right));
        return res<=1 && IsBalanced_Solution(root.left)
                && IsBalanced_Solution(root.right);
    }

    private int leftTree(TreeNode left) {
        if (left == null) return 0;
        return Math.max(1 + leftTree(left.left), 1 + leftTree(left.right));
    }

    private int rightTree(TreeNode right) {
        if (right == null) return 0;
        return Math.max(1 + rightTree(right.right), 1 + leftTree(right.left));
    }

    public static void main(String[] args) {

    }
}
