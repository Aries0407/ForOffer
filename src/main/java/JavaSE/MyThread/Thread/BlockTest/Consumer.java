package JavaSE.MyThread.Thread.BlockTest;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Aries
 * @date 2023/3/11 18:47
 */
public class Consumer implements Runnable{

    private ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue){
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
