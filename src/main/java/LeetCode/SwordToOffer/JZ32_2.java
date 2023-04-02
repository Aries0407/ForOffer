package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JZ32_2 {


    public static void main(String[] args) {

    }


    List<List<Integer>> lists = new ArrayList<>();
    LinkedList<TreeNode> linkedList = new LinkedList<>();

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
            for (int i = linkedList.size(); i>0; i--){
                TreeNode node = linkedList.poll();
                list.add(node.val);
                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
            lists.add(list);
        }
    }
}
