package JavaSE.ProducerAndConsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Aries
 * @date 2021/9/8 12:17
 *
 *
 * 生产者 --- 缓冲区 --- 消费者   阻塞队列实现
 */
public class ProducerAndConsumer2 {
    private static Integer count = 0; //商品数量
    private static final BlockingDeque<Integer> block = new LinkedBlockingDeque<>(); //阻塞队列大小

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {    //创造多个生产者和消费者
            new Thread(new Producer()).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Consumer()).start();
        }
    }


    static class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    block.put(1);
                    count++;  //商品++
                    System.out.println(Thread.currentThread().getName() + "生产者生产，共有商品" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    static class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    block.take();
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 消费者消费，目前共有商品 " + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


