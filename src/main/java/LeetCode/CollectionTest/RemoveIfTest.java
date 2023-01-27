package LeetCode.CollectionTest;

import java.util.*;

/**
 * @author Aries
 * @date 2022/12/18 17:19
 */
public class RemoveIfTest {

    private void removeIfTest() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
            {
                put(1, 1);
                put(2, 2);
                put(3, 2);
                put(4, 2);
            }
        };
        map.entrySet().removeIf(entry -> entry.getValue() == 2);
        map.keySet().removeIf(key -> key == 2);
        System.out.println(map);

        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(3);
                add(3);
                add(3);
            }
        };
        list.removeIf(i -> i.equals(3));
        System.out.println(list);
    }

    private void iteratorRemoveTest() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
            {
                put(1, 1);
                put(2, 2);
                put(3, 2);
                put(4, 2);
            }
        };
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getKey() == 2) {
                it.remove();
            }
        }
        System.out.println(map);

        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(3);
                add(3);
                add(3);
            }
        };
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i.equals(3)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        RemoveIfTest removeIfTest = new RemoveIfTest();
        removeIfTest.iteratorRemoveTest();
    }
}
