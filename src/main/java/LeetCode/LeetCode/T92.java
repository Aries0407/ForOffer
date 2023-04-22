package LeetCode.LeetCode;

public class T92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode temp = res;
        if (n == 1) return head;
        int index = 0;
        while (temp != null) {
            if (index == m - 1) {
                helper(temp, m - 1, n);
                break;
            }
            temp = temp.next;
            index++;
        }
        return res.next;
    }

    private void helper(ListNode head, int m, int n) {
        ListNode res1 = head;
        ListNode pre = null;
        ListNode cur = head.next;
        ListNode res2 = head.next;
        int index = m;
        while (head != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            index++;
            if (index == n) {
                res2.next = cur;
                break;
            }
        }
        res1.next = pre;
    }

    public static void main(String[] args) {

    }
}
