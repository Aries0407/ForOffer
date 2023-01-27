package LeetCode;



import java.util.LinkedList;
import java.util.List;

public class T94 {
    List<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return list;
        }
        inorderTraversal(root.left);
        if (root.left!=null){
            list.add(root.left.val);
        }
        list.add(root.val);
        inorderTraversal(root.right);
        if (root.right!=null){
            list.add(root.right.val);
        }
        return list;
    }



    public static void main(String[] args) {

    }
}
