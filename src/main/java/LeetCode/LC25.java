package LeetCode;

import LeetCode.List.LC2;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2021/9/10 9:42
 */
public class LC25 {

    static class ListNode {
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

    private static LinkedList<ListNode> listNodes = new LinkedList<>();

    public int getLen(ListNode head, int k) {
        int len = 0;
        while (head != null) {
            if (len % k == 0) {
                listNodes.add(head);
            }
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode[] reverse(ListNode pre, ListNode cur, int k) {
        ListNode h = cur;
        ListNode[] nodes = new ListNode[2];
        int index = 0;
        ListNode next = null;
        while (index < k) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            index++;
        }
        nodes[0] = pre;
        nodes[1] = h;
        return nodes;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int len = getLen(head, k);

        LinkedList<ListNode[]> lists = new LinkedList<>();

        ListNode cur = listNodes.poll();
        while (len - k >= 0) {
            ListNode[] nodes = reverse(null, cur, k);
            lists.add(nodes);
            cur = listNodes.poll();
            len -= k;
        }

        ListNode[] nodes = new ListNode[2];
        nodes[0] = cur;
        nodes[1] = null;
        lists.add(nodes);


        nodes = lists.poll();
        ListNode ret = nodes[0];
        ListNode tmp = nodes[1];
        while (!lists.isEmpty()) {
            nodes = lists.poll();
            tmp.next = nodes[0];
            tmp = nodes[1];
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
