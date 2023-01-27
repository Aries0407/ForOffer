package LeetCode;


import java.util.LinkedList;
import java.util.List;

public class T102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            lists.add(new LinkedList<>());
            return lists;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()) {
            {
                List<Integer> list = new LinkedList<>();
                int size = linkedList.size();
                while (size > 0) {
                    TreeNode node = linkedList.pollFirst();
                    list.add(node.val);
                    if (node.left != null) linkedList.add(node.left);
                    if (node.right != null) linkedList.add(node.right);
                    size--;
                }
                lists.add(list);
            }

        }
        return lists;
    }

    public static void main(String[] args) {

    }
}
