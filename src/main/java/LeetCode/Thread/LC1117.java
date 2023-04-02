package LeetCode.Thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Aries
 * @date 2023/3/26 11:32
 */
public class LC1117 {
    private CountDownLatch hydrogen = new CountDownLatch(0);
    private CountDownLatch oxygen = new CountDownLatch(2);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogen.await();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        for (int i = 0; i < 2; i++) {
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