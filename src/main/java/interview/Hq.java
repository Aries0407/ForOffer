package interview;

import java.util.List;

/**
 * @author Aries
 * @date 2021/9/13 12:30
 */
public class Hq {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    /*
 ÊäÈë£º(7 -> 1 -> 6) - (5 -> 9 -> 2)£¬¼´617 - 295
Êä³ö£º2 -> 2 -> 3£¬¼´322
ÊäÈë£º(5 -> 9 -> 2) - (7 -> 1 -> 6)£¬¼´ 295-617
Êä³ö£º2 -> 2 -> 3->-£¬¼´-322

  */


    public static ListNode getSum(ListNode head1, ListNode head2) {
        int sub = 0;
        int carry = 0;
        ListNode ret = new ListNode(-1);
        ListNode tmp = ret;
        while (head1 != null && head2 != null) {
            sub = head1.val - head2.val - carry;
            if (sub < 0) {
                carry = 1;
            }
            sub = head1.val + 10 - head2.val - carry;
            tmp.next = new ListNode(sub);
            tmp = tmp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        return ret.next;
    }
    public static int convert(ListNode head) {
        int i = 0;
        int cur = 0;
        while (head != null) {
            cur += Math.pow(10, i) * head.val;
            i++;
            head = head.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(6);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(2);


        int a = convert(head1);
        int b = convert(head2);
        System.out.println(a - b);
    }

}
