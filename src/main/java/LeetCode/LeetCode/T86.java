package LeetCode.LeetCode;

import java.util.LinkedList;

public class T86 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode smallHead = small;
        ListNode big = new ListNode(1);
        ListNode bigHead = big;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        big.next = null;
        small.next = bigHead.next;
        return smallHead.next;
    }

    public ListNode partition2(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode smallHead = small;
        ListNode big = new ListNode(1);
        ListNode bigHead = big;
        while (head != null) {
            if (head.val < x) {
                small.next = new ListNode(head.val);
                small = small.next;
            } else {
                big.next = new ListNode(head.val);
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }

    public ListNode partition1(ListNode head, int x) {
        LinkedList<ListNode> smallList = new LinkedList<>();
        LinkedList<ListNode> bigList = new LinkedList<>();
        ListNode ret = new ListNode(-1);
        ret.next = head;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                smallList.addLast(temp);
            } else {
                bigList.addLast(temp);
            }
            temp = temp.next;
        }
        helper(smallList, bigList, ret);
        return ret.next;
    }

    private void helper(LinkedList<ListNode> l1, LinkedList<ListNode> l2, ListNode head) {
        while (!l1.isEmpty()) {
            head.next = l1.pollFirst();
            head = head.next;
        }
        while (!l2.isEmpty()) {
            head.next = l2.pollFirst();
            head = head.next;
        }
        head.next = null;
    }

    public static void main(String[] args) {

    }
}
