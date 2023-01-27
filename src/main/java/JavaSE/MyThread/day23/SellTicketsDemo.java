package JavaSE.MyThread.day23;

public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets st1 = new SellTickets();
        SellTickets st2 = new SellTickets();
        st2.start();
        st1.start();
    }
}
