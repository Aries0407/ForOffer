package JavaSE.generic;

/**
 *
 *
 * @author Aries
 * @date 2023/3/18 21:30
 */
public class GenericImpl<T> implements GenericInterface<T>{

    @Override
    public T getT() {
        System.out.printf("yes");
        return null;
    }
}
