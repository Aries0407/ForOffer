package JavaSE.MyThread.day23;

public class ThreadYieldDemo {

    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();
        ThreadYield ty3 = new ThreadYield();

        ty1.setName("孙悟空");
        ty2.setName("猪八戒");

        ty1.start();
        ty2.start();

    }

}
