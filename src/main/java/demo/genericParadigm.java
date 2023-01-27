package demo;

/**
 * @author Aries
 * @date 2021/3/29 16:10
 */

import java.util.LinkedList;

/**
 * 泛型练习
 */
public class genericParadigm {
    public static<E> void print(E[] array){
        for(E element: array){
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        print(array);
        Double[] array2 = {1.1,2.2,3.3,4.4};
        print(array2);

        LinkedList<Number> list = new LinkedList<>();



    }
}
