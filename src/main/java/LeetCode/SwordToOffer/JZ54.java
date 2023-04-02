package LeetCode.SwordToOffer;

public class JZ54 {


    //递归遍历
    int k, res;

    public static void main(String[] args) {

    }

    public int kthLargest(TreeNode root, int k) {
        if (root == null && k > 0) return -1;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.right);
        if (k == 0) return;
        if (--k == 0) {
            res = root.val;
        }
        helper(root.right);
        return;
    }

}
