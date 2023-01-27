package NiuKe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ60 {

    /*
    从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     */
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot != null) queue.offer(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }


    public static void main(String[] args) {

    }
}
