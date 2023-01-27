package interview;


/**
 * @author Aries
 * @date 2021/4/18 20:47
 */
public class Tencent7 {

    public ListNode solve(ListNode S) {

        int n = 0;
        ListNode temp = S;
        ListNode head = S;
        ListNode tail = null;
        int min = S.val;
        while (temp != null) {
            if (temp.next == null) {
                tail = temp;
            }
            min = Math.min(temp.val, min);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            n++;
            if (temp.val == min) {
                break;
            }
            temp = temp.next;
        }
        temp = head;
        ListNode t = null;
        if (n - 1 == 0) return head;
        while (n - 1 > 0) {
            t = temp.next;
            temp.next = null;
            tail.next = temp;
            temp = t;
            n--;
        }
        return t;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}
