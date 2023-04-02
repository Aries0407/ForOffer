package LeetCode.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.function.IntConsumer;

/**
 * @author Aries
 * @date 2023/3/24 22:24
 */
public class LC1116 {
    private CountDownLatch zero = new CountDownLatch(0);
    private CountDownLatch even = new CountDownLatch(1);
    private CountDownLatch odd = new CountDownLatch(1);
    private static int n = 100;

    public static void main(String[] args) {
        System.out.println(2&1);
        System.out.println(1&1);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int j = 1; j <= n; j++) {
            zero.await();
            printNumber.accept(0);
            zero = new CountDownLatch(1);
            if ((j & 1) == 1) {
                odd.countDown();
            } else {
                even.countDown();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i1 = 1; i1 <= n; i1++) {
            if ((i1 & 1) == 0) {
                even.await();
                printNumber.accept(i1);
                even = new CountDownLatch(1);
                zero.countDown();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int j = 1; j <= n; j++) {
            if ((j & 1) == 1) {
                odd.await();
                printNumber.accept(j);
                odd = new CountDownLatch(1);
                zero.countDown();
            }
        }
    }
}
