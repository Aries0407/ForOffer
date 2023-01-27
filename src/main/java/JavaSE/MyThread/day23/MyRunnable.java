package JavaSE.MyThread.day23;

public class MyRunnable {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        Thread proxy = new Thread(t);
        proxy.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("main --> " + i);
        }
    }
}

class NewThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("真实角色==》"+i);
        }
    }
}
