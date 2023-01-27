package NiuKe;

import java.util.ArrayList;

public class JZ24 {
    /*
    输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
    路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     */
    ArrayList<ArrayList<Integer>> arraylist = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return arraylist;
        }
        ArrayList<Integer> list = new ArrayList<>();
        FindPathHelper(root,target,list);
        return arraylist;
    }

    public void FindPathHelper(TreeNode root, int target,
                                             ArrayList<Integer> list) {
        if(root != null) {
            target -= root.val;
            list.add(root.val);
            if (root.left==null && root.right==null && target == 0){
                arraylist.add(new ArrayList<>(list));
            }
            FindPathHelper(root.left, target, list);
            FindPathHelper(root.right,target,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {

    }
}
