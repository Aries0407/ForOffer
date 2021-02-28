package NiuKe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ22 {
    /*
    题目描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     */
    //成员变啦ing的初始化很重要
    private static ArrayList<Integer> list = new ArrayList<>();
    private static Queue<TreeNode> queue = new LinkedList<>();

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return list;
        } else {
            queue.offer(root);
            PrintFromTopToBottomHelper(root);
        }
        return list;
    }

    private void PrintFromTopToBottomHelper(TreeNode root) {
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            list.add(node.val);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }

    public static void main(String[] args) {

    }
}
