package NiuKe;

import java.util.Vector;

public class JZ14 {


    public ListNode FindKthToTail(ListNode head, int k) {
        Vector<ListNode> vector = new Vector<>();
        if(k<=0){
            return null;
        }
        ListNode node = head;
        if(node != null){
            vector.add(node);
        }else{
            return null;
        }
        while (node.next != null) {
            vector.add(node.next);
            node = node.next;
        }
        if (k > vector.size()) {
            return null;
        } else {
            return vector.get( vector.size() - k );
        }
    }

    public static void main(String[] args) {

    }
}


