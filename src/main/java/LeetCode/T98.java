package LeetCode;



public class T98 {
    int leftParent = Integer.MAX_VALUE;
    int rightParent = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        if (root.right == null && root.left.val >= root.val) {
            return false;
        } else if (root.left == null && root.right.val <= root.val) {
            return false;
        } else if (root.right != null && root.left != null) {
            if (root.left.val < root.val && root.right.val > root.val) {
                leftParent = Math.min(leftParent, root.val);
                rightParent = Math.max(rightParent, root.val);
                if (root.right.val > leftParent || root.left.val < rightParent) return false;
                return isValidBST(root.left) && isValidBST(root.right);
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
