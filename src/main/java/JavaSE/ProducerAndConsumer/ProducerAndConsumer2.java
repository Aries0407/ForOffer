package JavaSE.ProducerAndConsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Aries
 * @date 2021/9/8 12:17
 *
 *
 * ������ --- ������ --- ������   ��������ʵ��
 */
public class ProducerAndConsumer2 {
    private static Integer count = 0; //��Ʒ����
    private static final BlockingDeque<Integer> block = new LinkedBlockingDeque<>(); //�������д�С

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {    //�����������ߺ�������
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
                    count++;  //��Ʒ++
                    System.out.println(Thread.currentThread().getName() + "������������������Ʒ" + count);
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
                    System.out.println(Thread.currentThread().getName() + " ���������ѣ�Ŀǰ������Ʒ " + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


