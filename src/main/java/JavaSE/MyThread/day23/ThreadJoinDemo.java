package JavaSE.MyThread.day23;

public class ThreadJoinDemo {

    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        ThreadJoin tj4 = new ThreadJoin();
        tj1.setName("孙悟空");
        tj2.setName("猪八戒");
        tj3.setName("唐僧");
        tj4.setName("沙悟净");

        tj1.start();
        tj2.start();
        try {
            tj1.join();
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj3.start();
        tj4.start();
    }
}
