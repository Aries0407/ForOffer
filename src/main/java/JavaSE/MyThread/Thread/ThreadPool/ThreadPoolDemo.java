package JavaSE.MyThread.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Aries
 * @date 2023/3/11 23:22
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 无上线线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 固定线程池
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);

        executorService.submit(new MyRunnable());
        executorService.shutdown();


    }
}
