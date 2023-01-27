package LeetCode;

import java.util.*;

public class T381 {


    /**
     * Initialize your data structure here.
     */
    List<Integer> list;   //存值
    Map<Integer, Set<Integer>> map;   //存值和索引
    Random random;

    public T381() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        list.add(val);
        Set<Integer> set = map.getOrDefault(val, new HashSet<>());
        set.add(list.size() - 1);
        map.put(val, set);
        return set.size() == 1;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int i = map.get(val).iterator().next();
            int j = list.size() - 1;
            int jValue = list.get(j);
            swapList(i, j);
            swapMap(i, j, val, jValue);
            list.remove(j);
            map.get(val).remove(j);
            return true;
        }
    }

    public void swapList(int i, int j) {
        int iValue = list.get(i);
        list.set(i, list.get(j));
        list.set(j, iValue);
    }

    public void swapMap(int i, int j, int iValue, int jValue) {
        map.get(iValue).remove(i);
        map.get(iValue).add(j);
        map.get(jValue).remove(j);
        map.get(jValue).add(i);
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
