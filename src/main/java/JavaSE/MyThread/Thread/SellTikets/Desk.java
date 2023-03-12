package JavaSE.MyThread.Thread.SellTikets;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 19:25
 */
public class Desk {

    public static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);

    public static void main(String[] args) {
        Thread consumer1 = new Consumer(queue);
        Thread consumer2 = new Consumer(queue);
        Thread consumer3 = new Consumer(queue);
        Thread producer = new Thread(new Consumer(queue));
        consumer1.start();
        consumer2.start();
        consumer3.start();
        producer.start();



    }
}
