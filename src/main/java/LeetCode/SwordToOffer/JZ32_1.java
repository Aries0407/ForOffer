package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ32_1 {
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        linkedList.add(root);
        helper(root);
        int[] num = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num[i] = list.get(i);
        }
        return num;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        while (!linkedList.isEmpty()) {
            TreeNode node = linkedList.poll();
            list.add(node.val);
            if (node.left != null) linkedList.add(node.left);
            if (node.right != null) linkedList.add(node.right);
        }
    }

}
