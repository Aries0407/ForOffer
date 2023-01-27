package NiuKe;

import java.util.ArrayList;

public class JZ3 {
    ArrayList<Integer> arrayList = new ArrayList<>();

    /*
    牛客网；剑指offer第三题

    题目描述：
    输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     */

    /*
       方法二：
       递归：该题目很符合栈的后进先出的思想，因此可以使用栈的思想
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead2(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }


    /*
    方法一：
    非递归：从头到尾遍历链表，从尾到头插入集合
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
