package LeetCode.Thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Aries
 * @date 2023/3/26 11:32
 */
public class LC1117 {
    private CountDownLatch oxygen = new CountDownLatch(2);
    private CountDownLatch hydrogen = new CountDownLatch(0);
    public static void main(String[] args) {
        ThreadH h = new ThreadH();
        ThreadO o = new ThreadO();
        h.start();
        o.start();
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        for (int i = 0; i < 2; i++) {
            hydrogen.await();

            releaseHydrogen.run();
            if (i == 1) {
                hydrogen = new CountDownLatch(1);
            }
            oxygen.countDown();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygen.await();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        oxygen = new CountDownLatch(2);
        hydrogen.countDown();
    }
}

class ThreadH extends Thread{
    @Override
    public void run() {
        System.out.println("H");
    }
}

class ThreadO extends Thread{
    @Override
    public void run() {
        System.out.println("O");
    }
}