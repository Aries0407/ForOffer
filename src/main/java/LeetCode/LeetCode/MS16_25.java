package LeetCode.LeetCode;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Aries
 * @date 2021/4/25 20:07
 */
public class MS16_25 extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public MS16_25(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }


    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }


}
