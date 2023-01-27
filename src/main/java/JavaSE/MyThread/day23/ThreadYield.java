package JavaSE.MyThread.day23;

public class ThreadYield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            Thread.yield();//线程礼让
        }
    }
}
