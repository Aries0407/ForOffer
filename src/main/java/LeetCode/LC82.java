package LeetCode;

import java.util.concurrent.TimeoutException;

/**
 * @author Aries
 * @date 2021/4/23 9:49
 */
public class LC82 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode ret = new ListNode(0, head);
        ListNode cur = ret;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int num = cur.next.val;
                while (cur.next != null && cur.next.val == num) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return ret.next;
    }
}



