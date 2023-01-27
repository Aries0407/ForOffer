package LeetCode;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;


@Slf4j
public class T114 {
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        dfs(root, list);
        TreeNode head = new TreeNode(0);

        for (TreeNode node : list) {
            head.right = node;
            node.left = null;
            head = head.right;
        }
    }

    private void dfs(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        dfs(root.left, list);
        dfs(root.right, list);
    }

    static boolean run = true;
    final static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (run) {
                //...
                synchronized (lock) {
                    if (!run) {
                        break;
                    }
                }
            }
        });
        t.start();
        Thread.sleep(1000);
        log.debug("停止 t");
        run = false;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
