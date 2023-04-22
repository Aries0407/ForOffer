package LeetCode.LeetCode;



public class T226 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
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
