package NiuKe;

public class JZ58 {



    //递归方法
    boolean compare(TreeNode left,TreeNode right){
        if (left == null) return right == null;
        if (right == null) return false;
        if (left.val != right.val){
            return false;
        }else {
            return compare(left.left,right.right) && compare(left.right,right.left);
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return compare(pRoot.left,pRoot.right);
    }

    public static void main(String[] args) {

    }
}
