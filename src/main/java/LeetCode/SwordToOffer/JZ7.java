package LeetCode.SwordToOffer;

import java.util.HashMap;

public class JZ7 {
    HashMap<Integer, Integer> dic = new HashMap<>();
    int[] pre;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.pre = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        TreeNode root = helper(0,0,inorder.length-1);
        return root;
    }

    TreeNode helper(int pre_root, int left_idx, int right_idx) {
        if (left_idx > right_idx) return null;
        TreeNode root = new TreeNode(pre[pre_root]);
        int idx = dic.get(pre[pre_root]);
        root.left = helper(pre_root+1,left_idx,idx-1);
        root.right = helper(idx - left_idx+pre_root+1,idx+1,right_idx);
        return root;
    }

    public static void main(String[] args) {

    }
}
