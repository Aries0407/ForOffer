package LeetCode;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/4/21 16:45
 */
public class LC106 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode recur(int postRootIndex, int left, int right) {
        if (left > right) return null;
        int inorderRootIndex = map.get(postorder[postRootIndex]);
        TreeNode node = new TreeNode(postorder[postRootIndex]);
        node.left = recur(postRootIndex - right + inorderRootIndex - 1, left, inorderRootIndex - 1);
        node.right = recur(postRootIndex - 1, inorderRootIndex + 1, right);
        return node;
    }
}
