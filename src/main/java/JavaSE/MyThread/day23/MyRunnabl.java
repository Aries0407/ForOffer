package JavaSE.MyThread.day23;

public class MyRunnabl implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i< 100 ; i++){
            System.out.println(Thread.currentThread().getName()
                    + ":" + i);
        }
    }
}
