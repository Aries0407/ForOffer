package JavaSE.MyThread.day23;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private int num;

    public MyCallable(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0 ; i< num ; i++){
            sum+=i;
        }
        return sum;
    }
}
