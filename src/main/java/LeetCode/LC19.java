package LeetCode;


public class LC19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        LC19 t = new LC19();
        t.removeNthFromEnd(head,1);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(-1);
        ListNode res = slow;
        slow.next = head;
        ListNode fast = head;

        int count = 1;
        while (count <= n ) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return res;
    }
}
