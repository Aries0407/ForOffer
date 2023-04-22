package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aries
 * @date 2021/4/5 15:01
 */
public class LC56 {

    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] temp = intervals[i];
            int[] area = list.get(list.size() - 1);
            if (temp[0] <= area[1]) {
                area[1] = Math.max(temp[1], area[1]);
            } else {
                list.add(temp);
            }
        }
        int[][] ret = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {


    }
}
