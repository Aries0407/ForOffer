package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class T148 {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        ListNode ret = new ListNode(list.get(0));
        temp = ret;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return ret;
    }

}
