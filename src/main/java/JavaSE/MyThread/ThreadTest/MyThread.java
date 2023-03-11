package JavaSE.MyThread.ThreadTest;

/**
 * @author Aries
 * @date 2023/3/11 10:18
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
