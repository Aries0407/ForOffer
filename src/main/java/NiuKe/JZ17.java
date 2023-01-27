package NiuKe;

import javax.swing.table.TableRowSorter;

public class JZ17 {

    public boolean HasSubtreeHelper(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return HasSubtreeHelper(root1.left, root2.left) &&
                HasSubtreeHelper(root1.right, root2.right);
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if (root2 == null || root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            flag = HasSubtreeHelper(root1, root2);
        }
        if (!flag) {
            flag = HasSubtree(root1.left, root2);
        }
        if (!flag) {
            flag = HasSubtree(root1.right, root2);
        }
        return flag;
    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    private TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}