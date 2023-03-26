package LeetCode.Thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Aries
 * @date 2023/3/24 22:02
 */
public class LC1114 {
    CountDownLatch c1 = new CountDownLatch(1);
    CountDownLatch c2 = new CountDownLatch(1);
    public static void main(String[] args) {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        c1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        c1.await();

        c2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        c2.await();

    }
}
