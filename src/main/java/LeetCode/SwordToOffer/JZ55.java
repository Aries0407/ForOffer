package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.TreeMap;

public class JZ55 {
    public static void main(String[] args) {

    }


    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth1(root.left) + 1, maxDepth1(root.right) + 1);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        ArrayList<TreeNode> tmp;
        int count = 0;
        while (!list.isEmpty()) {
            tmp = new ArrayList<>();
            for (TreeNode node : list) {
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            list = tmp;
            count++;
        }
        return count;
    }

}

