package JavaSE.SingleTon;

/**
 * @author Aries
 * @date 2021/3/24 13:06
 */
public class SingletonPatternDemo1 {

    /**
     * 懒汉式
     * lazy初始化
     * 非线程安全
     */
    private static SingletonPatternDemo1 instance;

    private SingletonPatternDemo1() {
    }

    public static SingletonPatternDemo1 getInstance() {
        if (instance == null) {
            instance = new SingletonPatternDemo1();
            return instance;
        }
        return instance;
    }
}
