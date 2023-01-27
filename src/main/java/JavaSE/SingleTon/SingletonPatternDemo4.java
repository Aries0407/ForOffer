package JavaSE.SingleTon;

/**
 * @author Aries
 * @date 2021/3/24 13:16
 */
public class SingletonPatternDemo4 {
    /**
     * 双重检查锁
     * lazy初始化
     * 线程安全
     */

    private volatile static SingletonPatternDemo4 instance;
    private SingletonPatternDemo4(){}
    public static SingletonPatternDemo4 SingletonPatternDemo4(){
        if (instance == null){
            synchronized (SingletonPatternDemo4.class){
                if (instance == null){
                    instance = new SingletonPatternDemo4();
                }
            }
        }
        return instance;
    }
}
