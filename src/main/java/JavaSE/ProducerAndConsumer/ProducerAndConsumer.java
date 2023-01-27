package JavaSE.ProducerAndConsumer;

import java.util.TreeMap;

/**
 * @author Aries
 * @date 2021/9/8 12:17
 *
 *
 * ������ --- ������ --- ������   synchronizedʵ��
 */
public class ProducerAndConsumer {
    private static Integer count = 0; //��Ʒ����
    private static final Integer full = 10; //�������д�С
    private static final Object lock = new Object();   //��������

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

                synchronized (lock) {
                    while (count.equals(full)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;  //��Ʒ++
                    System.out.println(Thread.currentThread().getName() + "������������������Ʒ" + count);
                    lock.notifyAll();   //����������
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
                    System.out.println(Thread.currentThread().getName() + " ���������ѣ�Ŀǰ������Ʒ " + count);
                    lock.notifyAll(); //��Ʒ���ĺ�֪ͨ������
                }
            }
        }
    }
}


