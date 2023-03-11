package JavaSE.MyThread.ThreadTest;

/**
 * @author Aries
 * @date 2023/3/11 12:19
 */
public class SellTicketsImpl {
    public static void main(String[] args) {
        SellTicketsRunAble sellTicketsRunAble = new SellTicketsRunAble();
        Thread t1 = new Thread(sellTicketsRunAble);
        t1.start();

        Thread t2 = new Thread(sellTicketsRunAble);
        t2.start();

        Thread t3 = new Thread(sellTicketsRunAble);
        t3.start();
    }
}
