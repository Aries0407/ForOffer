package LeetCode.SwordToOffer2;


import java.util.LinkedHashMap;

/**
 * @author Aries
 * @date 2021/9/6 9:19
 */
public class JZ031 {

    private int cap = 0;
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

    public JZ031(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            if (map.size() >= cap) {
                map.remove(map.keySet().iterator().next());
            }
        }
        map.put(key, value);
    }

}
