package LeetCode.List;

/**
 * @author Aries
 * @date 2021/5/4 8:39
 */
public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode tmp = ret;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            tmp.next = new ListNode(value % 10);
            carry = value / 10;
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l2 != null) {
            int value = l2.val + carry;
            tmp.next = new ListNode(value % 10);
            carry = value / 10;
            tmp = tmp.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int value = l1.val + carry;
            tmp = new ListNode(value % 10);
            carry = value / 10;
            tmp = tmp.next;
            l1 = l1.next;
        }
        if (carry != 0) tmp.next = new ListNode(carry);
        return ret.next;
    }
}


class ListNode {
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