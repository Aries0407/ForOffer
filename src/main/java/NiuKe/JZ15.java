package NiuKe;


public class JZ15 {


    public ListNode ReverseList(ListNode head) {
       if(head==null){
           return null;
       }
       ListNode pre = null;
       ListNode next = null;

       while (head!=null){
           next = head.next;
           head.next = pre;
           pre = head;
           head = next;
       }
       return pre;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
