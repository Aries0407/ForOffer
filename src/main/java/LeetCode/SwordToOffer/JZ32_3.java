package LeetCode.SwordToOffer;

import java.util.*;

public class JZ32_3 {

    List<List<Integer>> lists = new ArrayList<>();
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    boolean ltr = true;

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return lists;
        linkedList.add(root);
        helper(root);
        return lists;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        while (!linkedList.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = linkedList.size(); i > 0; i--) {
                TreeNode node = linkedList.poll();
                list.add(node.val);
                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
            if (ltr) {
                ltr = false;
            } else {
                ltr = true;
                Collections.reverse(list);
            }
            lists.add(list);
        }
    }
}
