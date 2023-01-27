package JavaSE.MyThread.day23;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        method1();
        method2();

    }

    private static void method2() {
        ThreadGroup tg = new ThreadGroup("新线程组");
        MyRunnabl my = new MyRunnabl();
        Thread t1 = new Thread(tg,my,"孙悟空");
        Thread t2 = new Thread(tg,my,"猪八戒");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());

    }

    private static void method1() {
        MyRunnabl runnabl = new MyRunnabl();
        Thread t1 = new Thread(runnabl,"孙悟空");
        Thread t2 = new Thread(runnabl,"猪八戒");

        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();
        String name1 = tg1.getName();
        String name2 = tg2.getName();
        System.out.println(name1);
        System.out.println(name2);
    }
}
