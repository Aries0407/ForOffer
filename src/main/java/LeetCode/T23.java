package LeetCode;

import java.util.Arrays;

public class T23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists[0] == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        boolean[] empty = new boolean[lists.length];
        boolean allEmpty = false;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) empty[i] = true;
        }
        System.out.println(Arrays.toString(empty));
        while (!allEmpty) {
            boolean flag = false;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = helper(lists, empty);
                if (node == null) break;
                temp.next = new ListNode(node.val);
                temp = temp.next;
            }
            for (boolean b : empty) {
                if (!b) {
                    flag = true;
                    break;
                }
            }
            if (!flag) allEmpty = true;
        }
        return res.next;
    }

    ListNode helper(ListNode[] lists, boolean[] empty) {
        ListNode temp;
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (empty[i]) continue;
            if (lists[i].val < min) {
                index = i;
                min = lists[index].val;
            }
        }
        if (index == -1) {
            return null;
        }
        temp = lists[index];
        if (lists[index].next == null) {
            empty[index] = true;
        } else {
            lists[index] = lists[index].next;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
