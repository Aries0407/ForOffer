package NiuKe;

public class JZ36 {

    /*
    输入两个链表，找出它们的第一个公共结点。
    （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，
    保证传入数据是正确的）
     */

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        while (node1 != node2) {
            node1 = node1 == null ? node1.next : pHead2;
            node2 = node2 == null ? node2.next : pHead1;

        }
        return node1;
    }

    public static void main(String[] args) {

    }
}
