package LeetCode.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LC1207 {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer num:map.keySet()){
            if (set.contains(map.get(num))) {
                return false;
            }
            else {
                set.add(map.get(num));
            }
        }
        return true;
    }
}
