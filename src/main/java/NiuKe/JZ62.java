package NiuKe;

public class JZ62 {
    /*
    给定一棵二叉搜索树，请找出其中的第k小的结点。
    例如， （5，3，7，2，4，6，8）    中，
    按结点数值大小顺序第三小结点的值为4。
     */
    TreeNode res ;
    int k;

    TreeNode KthNode(TreeNode pRoot, int k) {
        this.k = k;
        dfs(pRoot);
        return res;
    }

    private void dfs(TreeNode pRoot) {
        if (pRoot == null) {
            return;
        }
        dfs(pRoot.left);
        if (k == 0) return;
        if (--k == 0) res = pRoot;
        dfs(pRoot.right);
        return ;
    }


    public static void main(String[] args) {

    }


}
