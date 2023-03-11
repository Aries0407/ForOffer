package JavaSE.MyThread.ThreadTest;

/**
 * @author Aries
 * @date 2023/3/11 12:17
 */
public class SellTicketsRunAble implements Runnable {

    private int count = 0;
    private Object loc = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (loc) {
                if (count < 100){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() +
                            "正在卖第" + count + "张票");
                }else {
                    break;
                }
            }
        }
    }
}
