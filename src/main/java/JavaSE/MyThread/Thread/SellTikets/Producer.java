package JavaSE.MyThread.Thread.SellTikets;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 19:21
 */
public class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (queue.isEmpty()) {
            try {
                queue.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
