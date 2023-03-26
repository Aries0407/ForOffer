package JavaSE;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Aries
 * @date 2021/4/23 16:50
 */
public class Test {
    /*
    两个 new Integer() 比较 ，永远是 false。

    两个Integer 变量比较，值都在-128到127区间（含），则为true，否则为 false 。
    java对于-128到127之间的数，会进行缓存。
    所以 Integer i = 127 时，会将127进行缓存，下次再写Integer j = 127时，就会直接从缓存中取，就不会 new 了。

    Integer 和 new Integer() 比较 ，永远为 false。
    int 与 Integer、 new Integer() 比较时，只要值相等，则为true。
     */
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        Integer i3 = 100;
        Integer i4 = 100;
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i3 == i4);
        System.out.println(i5 == i6);
        ArrayList<Integer> list = new ArrayList<>();
        Hashtable<Integer,Integer> i = new Hashtable<>();
        i.get(1);
        ConcurrentHashMap<Integer,Integer> ee = new ConcurrentHashMap<>();
        ee.put(1,1);

//        List<String> L = List.of("1");



    }
}
