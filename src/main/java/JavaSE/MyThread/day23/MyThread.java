package JavaSE.MyThread.day23;

public class MyThread {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.start();
        tortoise.start();
        for (int i = 0 ; i<3; i++){
            System.out.println("main >=" + i);
        }
    }
}


class Rabbit extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i< 100; i++){
            System.out.println("rabbit run "+i+" 步");
        }
    }
}

class Tortoise extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i< 300 ; i++){
            System.out.println("tortoise run " + i + " 步");
        }
    }
}