package JavaSE.SingleTon;

/**
 * @author Aries
 * @date 2021/3/24 13:09
 */
public class SingletonPatternDemo2 {
    /**
     * 懒汉式
     * 线程安全
     * lazy初始化
     */
    private static SingletonPatternDemo2 instance;

    private SingletonPatternDemo2() {
    }

    public static synchronized SingletonPatternDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonPatternDemo2();
            return instance;
        }
        return instance;
    }
}
