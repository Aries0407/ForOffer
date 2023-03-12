package JavaSE.MyThread.Thread;

/**
 * @author Aries
 * @date 2023/3/11 18:09
 */
public class Consumer implements Runnable{

    @Override
    public void run() {
        while (true) {
            synchronized (ProducerAndConsumerTest.lock) {
                if (ProducerAndConsumerTest.count == 0){
                    break;
                }else {
                    if (ProducerAndConsumerTest.flag == 0) {
                        try {
                            ProducerAndConsumerTest.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(Thread.currentThread().getName() +
                                "正在吃倒数第" + ProducerAndConsumerTest.count +"碗饭");
                        ProducerAndConsumerTest.flag = 0;
                        ProducerAndConsumerTest.lock.notifyAll();
                    }
                }
            }
        }
    }
}
