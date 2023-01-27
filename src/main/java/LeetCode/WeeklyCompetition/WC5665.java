package LeetCode.WeeklyCompetition;

import java.util.ArrayList;
import java.util.HashMap;

public class WC5665 {
    public int[] restoreArray(int[][] adjacentPairs) {
        if (adjacentPairs.length == 2) return adjacentPairs[0];
        int[] ret = new int[adjacentPairs.length + 1];
        ArrayList<int[]> list = new ArrayList<>(ret.length);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < adjacentPairs.length; i++) {
            list.add(adjacentPairs[i]);
            for (int j = 0; j < adjacentPairs[i].length; j++) {
                int key = adjacentPairs[i][j];
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        int start = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                start = key;
                break;
            }
        }
        for (int i = 0; i < ret.length; i++) {
            ret[i] = start;
            for (int j = 0; j < list.size(); j++) {
                int[] num = list.get(j);
                if (num[0] == start || num[1] == start){
                    list.remove(j);
                    if (num[0] == start){
                        start = num[1];
                    }else {
                        start = num[0];
                    }
                    break;
                }
            }
        }
        ret[ret.length-1] = start;
        return ret;
    }

    public static void main(String[] args) {

    }

}
