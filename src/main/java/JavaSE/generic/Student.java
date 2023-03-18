package JavaSE.generic;

/**
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
}
