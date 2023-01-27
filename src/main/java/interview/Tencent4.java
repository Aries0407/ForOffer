package interview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aries
 * @date 2021/4/4 20:01
 */
public class Tencent4 {
    public TreeNode solve(TreeNode root) {
        TreeNode head = root;
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int curLevelSize = queue.size();
            for (int i = 1; i <= curLevelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left == null || node.right == null) {
                    node.left = null;
                    node.right = null;
                } else {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }
        return head;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        Tencent4 t = new Tencent4();
        t.solve(root);

    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}