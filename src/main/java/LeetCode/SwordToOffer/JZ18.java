package LeetCode.SwordToOffer;


public class JZ18 {
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                if (cur.next == null) {
                    pre.next = null;
                } else {
                    pre.next = cur.next;
                }
                return head;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
