package LeetCode.LeetCode;

import java.util.Map;
import java.util.TreeMap;

public class T147 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(1);
        n1.next.next.next = new ListNode(3);
        T147 t = new T147();
        ListNode te = t.insertionSortList(n1);

    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        Map<Integer, ListNode> map = new TreeMap<>();
        ListNode temp = head;
        while (temp != null) {
            map.put(temp.val, temp);
            temp = temp.next;
        }

        ListNode queueHead = new ListNode(-1);
        ListNode temp2 = queueHead;
        for (Integer i : map.keySet()) {
            temp2.next = map.get(i);
            
        }
        return queueHead.next;
    }
}
