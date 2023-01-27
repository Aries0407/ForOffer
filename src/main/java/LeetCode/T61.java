package LeetCode;

public class T61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        ListNode oldTail = null;
        while (temp != null) {
            if (temp.next == null) {
                oldTail = temp;
            }
            len++;
            temp = temp.next;
        }
        k = k % len;
        int len2 = len - k;
        ListNode newHead = head;
        temp = head;
        int count = 0;
        while (count < len2) {
            count++;
            temp = temp.next;
        }
        newHead = temp.next;
        temp.next = null;
        oldTail.next = head;

        return newHead;
    }

    public static void main(String[] args) {

    }
}
