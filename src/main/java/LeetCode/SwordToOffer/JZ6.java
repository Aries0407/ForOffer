package LeetCode.SwordToOffer;



import java.util.ArrayList;
import java.util.LinkedList;

public class JZ6 {

    //方法一：辅助栈
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            linkedList.addFirst(tmp.val);
            tmp = tmp.next;
        }
        int i = 0;
        int[] res = new int[length];
        while (head != null) {
            res[i] = linkedList.pollLast();
            i++;
            head = head.next;
        }
        return res;
    }

    //方法二：递归
    int i = 0;
    int j = 0;
    int[] ret;

    public int[] reversePrint2(ListNode head) {
        helper(head);
        return ret;
    }


    private void helper(ListNode node) {
        if (node == null) {
            ret = new int[i];
            return;
        }
        i++;
        helper(node.next);
        ret[j++] = node.val;
    }

    public static void main(String[] args) {

    }
}
