package NiuKe;

import java.util.Arrays;

public class JZ4 {

    /*
    重建二叉树 ,有点难
    输入某二叉树的前序遍历和中序遍历的结果，
    请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
    则重建二叉树并返回。
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }
        if (pre.length == 1) {
            return new TreeNode(pre[0]);
        }
        int rootVal = pre[0];
        int rootIndex = 0;
        TreeNode root = new TreeNode(rootVal);
        for (int i = 0; i < in.length; i++) {
            if (rootVal == in[i]) {
                rootIndex = i;
                break;
            }
        }

        root.left = reConstructBinaryTree(
                Arrays.copyOfRange(pre, 1, rootIndex + 1),
                Arrays.copyOfRange(in, 0, rootIndex)
        );

        root.right = reConstructBinaryTree(
                Arrays.copyOfRange(pre, rootIndex + 1, pre.length),
                Arrays.copyOfRange(in, rootIndex + 1, in.length)
        );
        return root;
    }

    public static void main(String[] args) {

    }
}
