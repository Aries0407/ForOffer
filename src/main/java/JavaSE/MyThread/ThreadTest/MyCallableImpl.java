package JavaSE.MyThread.ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Aries
 * @date 2023/3/11 10:09
 */
public class MyCallableImpl {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        Thread t1 = new Thread(futureTask);
        t1.start();
        Integer res = 0;
        try {
            res = futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
