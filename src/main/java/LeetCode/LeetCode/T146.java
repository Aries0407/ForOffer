package LeetCode.LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class T146 extends LinkedHashMap{
    int capacity = 0;
    LinkedHashMap<Integer,Integer> map ;

    public T146(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        map.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {


    }
}
