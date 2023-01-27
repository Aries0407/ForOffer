package NiuKe;

public class JZ56 {
    /*
    在一个  排序  的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     */

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode head = new ListNode(-1);
        head.next = pHead;
        ListNode front = head;
        ListNode tail = head.next;
        while (tail != null) {
            if (tail.next != null && tail.val == tail.next.val) {
                while (tail.next != null && tail.val == tail.next.val) {
                    tail = tail.next;
                }
                front.next = tail.next;
                tail = tail.next;
            } else {
                front = front.next;
                tail = tail.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        JZ56 jz56 = new JZ56();
        ListNode p = new ListNode(1);
        p.next = new ListNode(2);
        p.next.next = new ListNode(3);
        p.next.next.next = new ListNode(3);
        p.next.next.next.next = new ListNode(4);
        p.next.next.next.next.next = new ListNode(4);
        p.next.next.next.next.next.next = new ListNode(5);
        ListNode res = jz56.deleteDuplication(p);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
