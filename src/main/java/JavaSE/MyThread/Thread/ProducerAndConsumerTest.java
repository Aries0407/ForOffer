package JavaSE.MyThread.Thread;

/**
 * @author Aries
 * @date 2023/3/11 18:10
 */
public class ProducerAndConsumerTest {
    public static int flag = 0;
    public static int count = 10;

    public static final Object lock = new Object();

    public static void main(String[] args) {
        Thread producer = new Producer();
        Runnable consume = new Consumer();
        Thread consumer = new Thread(consume);

        producer.setName("producer");
        consumer.setName("consumer");

        producer.start();
        consumer.start();

    }
}
