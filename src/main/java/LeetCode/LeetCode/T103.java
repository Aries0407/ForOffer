package LeetCode.LeetCode;



import java.util.LinkedList;
import java.util.List;

public class T103 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int count = 1;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new LinkedList<>();
            while (size > 0) {
                TreeNode node;
                if (count % 2 == 1) {
                    node = nodes.pollFirst();
                } else {
                    node = nodes.pollLast();
                }
                list.add(node.val);
                if (count % 2 == 1) {
                    if (node.left != null) {
                        nodes.add(node.left);
                    }
                    if (node.right != null) {
                        nodes.add(node.right);
                    }
                } else {
                    if (node.right != null) {
                        nodes.addFirst(node.right);
                    }
                    if (node.left != null) {
                        nodes.addFirst(node.left);
                    }
                }
                size--;
            }
            count++;
            lists.add(list);
        }
        return lists;
    }
}
