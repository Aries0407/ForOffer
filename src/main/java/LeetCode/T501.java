package LeetCode;



import java.util.*;

public class T501 {

    public int[] findMode(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        Collections.sort(list, ((o1, o2) -> o2 - o1));
        int maxCount = 0;
        int maxVal = list.get(0);
        int count = 0;
        int len=0;
        for (int i = 0; i < list.size(); i++) {
            if (maxVal != list.get(i)) {
                maxCount = count;
                count = 0;
                break;
            } else {
                count++;
            }
        }
        len = maxCount;
        for (int i = 0; i < list.size(); i++) {
            if (maxVal!=list.get(i)){
                maxVal = list.get(i);
                if (count != maxCount) {
                    break;
                }else {
                    len++;
                }
            }
        }

        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        else {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public static void main(String[] args) {

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
