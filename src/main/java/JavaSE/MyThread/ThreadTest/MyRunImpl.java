package JavaSE.MyThread.ThreadTest;

/**
 * @author Aries
 * @date 2023/3/11 10:17
 */
public class MyRunImpl {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.start();
    }
}
