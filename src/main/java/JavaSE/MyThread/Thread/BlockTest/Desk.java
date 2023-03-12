package JavaSE.MyThread.Thread.BlockTest;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 18:47
 */
public class Desk {
    public static ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

    public static void main(String[] args) {
        Thread producer = new Producer(queue);
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

    }
}
