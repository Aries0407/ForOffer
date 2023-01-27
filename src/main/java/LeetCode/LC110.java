package LeetCode;

/**
 * @author Aries
 * @date 2021/4/5 15:52
 */
public class LC110 {


    //从顶至底
    public boolean isBalanced1(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (Math.abs(hight1(root.left) - hight1(root.right)) > 1) return false;
        return isBalanced1(root.left) && isBalanced1(root.right);
    }


    public int hight1(TreeNode root) {
        if (root == null) return 0;
        return Math.max(hight1(root.left) + 1, hight1(root.right) + 1);
    }


    //从底至顶
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }

    }


}
