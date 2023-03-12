package JavaSE.MyThread.Thread;

/**
 * @author Aries
 * @date 2023/3/11 18:08
 */
public class Producer extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized(ProducerAndConsumerTest.lock) {
                if (ProducerAndConsumerTest.count == 0) {
                    break;
                }else {
                    if (ProducerAndConsumerTest.flag == 1) {
                        try {
                            ProducerAndConsumerTest.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(Thread.currentThread().getName() + "正在做饭......");
                        ProducerAndConsumerTest.count--;
                        ProducerAndConsumerTest.flag = 1;
                        ProducerAndConsumerTest.lock.notifyAll();
                    }
                }
            }
        }
    }
}
