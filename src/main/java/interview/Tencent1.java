package interview;


import java.util.LinkedList;


/**
 * @author Aries
 * @date 2021/3/21 19:52
 */
public class Tencent1 {
    public static void main(String[] args) {
        int []b = {1,2,3,4,5,6,7};
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.left = new TreeNode(7);
        Tencent1 tencent1 = new Tencent1();
        tencent1.solve(root,b);
    }


    LinkedList<ListNode> nodes = new LinkedList<>();

    public ListNode[] solve(TreeNode root, int[] b) {
        // write code here
        for (int i = 0; i < b.length; i++) {
            LinkedList<ListNode> list = new LinkedList<>();
            dfs(root, b[i], list);
        }
        ListNode[] ret = new ListNode[b.length];
        for (int i = 0; i < nodes.size(); i++) {
            ret[i] = nodes.get(i);
        }
        return ret;
    }

    private void dfs(TreeNode root, int i, LinkedList<ListNode> list) {
        if (root == null) return;
        if (root.val == i) {
            list.addLast(new ListNode(root.val));


            ListNode head = list.pollFirst();
            ListNode temp = new ListNode(-1);
            temp.next = head;
            while (!list.isEmpty()) {
                head.next = list.pollFirst();
                head = head.next;
            }
            System.out.println();
            nodes.addLast(temp.next);
            return;
        }
        list.addLast(new ListNode(root.val));
        dfs(root.left, i, list);

        dfs(root.right, i, list);
        list.pollLast();
    }

    public static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
