package JavaSE.MyThread.day23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new MyRunnabl());
        pool.submit(new MyRunnabl());
        pool.shutdown();
    }
}
