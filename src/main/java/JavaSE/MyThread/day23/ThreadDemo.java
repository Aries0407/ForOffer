package JavaSE.MyThread.day23;

public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i< 100 ; i++){
                    System.out.println(Thread.currentThread().getName()
                            + ":" + i);
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i< 100 ; i++){
                    System.out.println(Thread.currentThread().getName()
                            + ":" + i);
                }
            }
        }){

        }.start();


        //只走子类对象的run
        new Thread(new Runnable() {
            @Override
            public void run() {
                    for(int i = 0 ; i< 100 ; i++){
                        System.out.println("hello" + ":" + i);
                    }
            }
        }){
            @Override
            public void run() {
                for(int i = 0 ; i< 100 ; i++){
                    System.out.println("world" + ":" + i);
                }
            }
        }.start();


    }
}
