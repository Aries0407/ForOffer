package JavaSE.MyThread.ThreadTest;

import java.util.concurrent.Callable;

/**
 * @author Aries
 * @date 2023/3/11 9:54
 */
public class MyCallable implements Callable {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += 1;
        }
        return sum;
    }

}
