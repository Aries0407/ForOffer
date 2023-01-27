package LeetCode;

import java.util.ArrayList;

public class T234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int i = 0;
        int j = list.size()-1;
        while (i < j) {
            if (list.get(i).val != list.get(j).val) return false;
            i++;
            j--;
        }
        return true;
    }
}
