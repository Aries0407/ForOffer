package JavaSE.SingleTon;

/**
 * @author Aries
 * @date 2021/3/24 13:23
 */
public class SingletonPatternDemo5 {
    /**
     * 匿名内部类
     * 线程安全
     */
    private static class classHolder {
        private static final SingletonPatternDemo5 instance = new SingletonPatternDemo5();
    }

    private SingletonPatternDemo5() {
    }

    public static final SingletonPatternDemo5 getInstance() {
        return classHolder.instance;
    }

}
