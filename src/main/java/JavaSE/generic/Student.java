package JavaSE.generic;

/**
 * 泛型类
 *
 * @author Aries
 * @date 2023/3/18 21:11
 */
public class Student <T>{
    private T t;

    public void set(T t){
        this.t = t;
    }

    public T getT(){
        return this.t;
    }


    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public <T> void setNumber(T t){
        System.out.println(t);
    }
}
