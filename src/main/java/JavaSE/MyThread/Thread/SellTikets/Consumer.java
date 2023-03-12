package JavaSE.MyThread.Thread.SellTikets;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 19:16
 */
public class Consumer extends Thread {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!queue.isEmpty()) {
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
