package interview;

import java.util.HashMap;

/**
 * @author Aries
 * @date 2021/5/9 19:00
 */
public class ByteDance5 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 100; i >=0; i--) {
            map.put(i,10);
        }
        for (int i : map.keySet()){
            System.out.println(i);
        }
    }
}
