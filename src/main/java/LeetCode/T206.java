package LeetCode;

public class T206 {
    //迭代法
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //递归法
    public ListNode reverseList(ListNode head) {
        return helper(null, head);
    }

    private ListNode helper(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }else {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            return helper(pre,cur);
        }
    }

    public static void main(String[] args) {

    }
}
