package JavaSE.MyThread.day23;

public class SellTickets extends Thread {
    private static int tickets = 1000;

    @Override
    public void run() {
        synchronized(this){
            while (tickets>0){

                System.out.println(Thread.currentThread().getName()+
                        "正在出售第"+ tickets-- + "张票");

            }
        }
    }
}
