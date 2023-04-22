package LeetCode.LeetCode;



public class T543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return Math.max(max, diameterOfBinaryTree(root.left) + 1 + diameterOfBinaryTree(root.right) + 1);
    }
}
