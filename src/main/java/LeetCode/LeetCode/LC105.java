package LeetCode.LeetCode;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/4/20 19:54
 */
public class LC105 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        this.preorder = preorder;
        return recur(0, 0, preorder.length - 1);
    }

    private TreeNode recur(int preorderIndex, int left, int right) {
        if (left > right) return null;
        int inorderIndex = map.get(preorder[preorderIndex]);
        TreeNode node = new TreeNode(preorder[preorderIndex]);
        node.left = recur(preorderIndex + 1, left, inorderIndex - 1);
        node.right = recur(preorderIndex - inorderIndex + left - 1, inorderIndex + 1, right);
        return node;
    }
}
