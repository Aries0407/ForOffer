package NiuKe;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class JZ59 {

    /*
    请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
    第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     */

    /*
    双向队列提高效率
     */

    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    Deque<TreeNode> deque = new LinkedList<>();

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot != null) deque.offer(pRoot);
        boolean ltr = true;
        while (!deque.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = null;
                if (ltr) {
                    node = deque.pollFirst();
                    if (node.left != null) deque.offer(node.left);
                    if (node.right != null) deque.offer(node.right);
                }
                if (!ltr) {
                    node = deque.pollLast();
                    if (node.right != null) deque.push(node.right);
                    if (node.left != null) deque.push(node.left);
                }
                list.add(node.val);
            }
            ltr = !ltr;
            lists.add(list);
        }
        return lists;
    }


    public static void main(String[] args) {

    }
}
