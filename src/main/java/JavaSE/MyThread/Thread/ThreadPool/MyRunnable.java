package JavaSE.MyThread.Thread.ThreadPool;

/**
 * @author Aries
 * @date 2023/3/11 23:22
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
