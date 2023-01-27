package JavaSE.SingleTon;

/**
 * @author Aries
 * @date 2021/3/24 13:11
 */
public class SingletonPatternDemo3 {
    /**
     * 饿汉式
     * 非lazy初始化
     * 线程安全
     */
    private static SingletonPatternDemo3 instance = new SingletonPatternDemo3();
    private SingletonPatternDemo3(){}

    public static SingletonPatternDemo3 getInstance(){
        return instance;
    }

}
