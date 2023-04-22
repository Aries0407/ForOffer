package LeetCode.LeetCode;

import java.util.ArrayList;

public class T143 {

    public void reorderList(ListNode head) {
        if (head.next == null) return;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            ListNode temp2 = temp.next;
            temp.next = null;
            list.add(temp);
            temp = temp2;
        }
        temp = head;
        int i = 1;
        int j = list.size() - 1;
        int flag = 1;
        while (i <= j) {
            if (flag < 0) {
                temp.next = list.get(i);
                i++;
            } else {
                temp.next = list.get(j);
                j--;
            }
            temp = temp.next;
            flag = -flag;
        }
    }

    public static void main(String[] args) {

    }
}
