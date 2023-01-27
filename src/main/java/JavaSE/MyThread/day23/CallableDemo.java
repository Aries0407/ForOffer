package JavaSE.MyThread.day23;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = pool.submit(new MyCallable(10));
        Future<Integer> f2 = pool.submit(new MyCallable(5));

        Integer i1 = 0;
        Integer i2 = 0;
        try {
             i1 = f1.get();
             i2 = f2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pool.shutdown();
        System.out.println(i1);
        System.out.println(i2);
    }
}
