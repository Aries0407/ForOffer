package JavaSE.MyThread.ThreadTest;

import java.util.concurrent.CountDownLatch;

/**
 * @author Aries
 * @date 2023/3/24 21:53
 */
public class CountDownLatchTest {


    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(1);
        ThreadA a = new ThreadA(c);
        ThreadB b = new ThreadB(c);
        a.start();
        b.start();
    }
}
class ThreadA extends Thread{
    private CountDownLatch countDownLatch;
    public ThreadA(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.print("A");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}


class ThreadB extends Thread{
    private CountDownLatch countDownLatch ;
    public ThreadB(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.print("B");
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}