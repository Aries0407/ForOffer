package LeetCode.Thread;

/**
 * @author Aries
 * @date 2021/4/26 10:20
 */
public class LC1115 {
    private int n;
    Object lock = new Object();
    private volatile boolean type = true;

    public LC1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (!type) {
                    lock.wait();
                }
                printFoo.run();
                type = false;
                lock.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (type) {
                    lock.wait();
                }
                printBar.run();
                type = true;
                lock.notifyAll();
            }

        }
    }
}
