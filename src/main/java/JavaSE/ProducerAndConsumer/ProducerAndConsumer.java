package JavaSE.ProducerAndConsumer;

import java.util.TreeMap;

/**
 * @author Aries
 * @date 2021/9/8 12:17
 *
 *
 * 生产者 --- 缓冲区 --- 消费者   synchronized实现
 */
public class ProducerAndConsumer {
    private static Integer count = 0; //商品数量
    private static final Integer full = 10; //阻塞队列大小
    private static final Object lock = new Object();   //对象锁；

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

                synchronized (lock) {
                    while (count.equals(full)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;  //商品++
                    System.out.println(Thread.currentThread().getName() + "生产者生产，共有商品" + count);
                    lock.notifyAll();   //唤醒消费者
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
                synchronized (lock) {
                    while (count == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 消费者消费，目前共有商品 " + count);
                    lock.notifyAll(); //商品消耗后通知生产者
                }
            }
        }
    }
}


