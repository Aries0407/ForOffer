package JavaSE.MyThread.Thread.BlockTest;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 18:47
 */
public class Producer extends Thread {


    private ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (queue.isEmpty()) {
            try {
                queue.put("饭");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
