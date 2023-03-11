package JavaSE.MyThread.ThreadTest;

/**
 * @author Aries
 * @date 2023/3/11 10:17
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
