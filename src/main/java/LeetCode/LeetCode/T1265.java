package LeetCode.LeetCode;


import java.util.concurrent.ThreadPoolExecutor;

public class T1265 {
    public void printLinkedListInReverse(ImmutableListNode head) {
        while (head!=null){
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor;
    }
}


// This is the ImmutableListNode's API interface.
// You should not implement it, or speculate about its implementation.
interface ImmutableListNode {
    public void printValue(); // print the value of this node.

    public ImmutableListNode getNext(); // return the next node.
};

