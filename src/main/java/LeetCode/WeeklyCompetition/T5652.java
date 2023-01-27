package LeetCode.WeeklyCompetition;


import java.util.ArrayList;

public class T5652 {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        ListNode node1 = list.get(k - 1);
        ListNode node2 = list.get(list.size() - k);
        list.set(k - 1, node2);
        list.set(list.size() - k, node1);
        ListNode ret = list.get(0);
        ListNode node = ret;
        for (int i = 1; i < list.size(); i++) {
            node.next = list.get(i);
            node = node.next;
        }
        node.next = null;
        return ret;
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
