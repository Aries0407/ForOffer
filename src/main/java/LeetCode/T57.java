package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T57 {

    public static void main(String[] args) {
        T57 t57 = new T57();
        int[][] intervals = {{1, 5}, {10,14}};
        int[] newIntervals = {7, 8};
        int[][] res = t57.insert(intervals, newIntervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        //情况一：intervals为空
        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        int start = newInterval[0];
        int end = newInterval[1];
        boolean sf = false;
        boolean ef = false;
        List<int[]> list = new ArrayList<>();
        //情况二：新区间最大值小于原有区间最小值
        if (newInterval[1] < intervals[0][0]) {
            list.add(new int[]{start, end});
            for (int i = 0; i < intervals.length; i++) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        //情况三：新区间最小值小于原有区间最大值
        if (newInterval[0] > intervals[intervals.length - 1][1]) {
            for (int i = 0; i < intervals.length; i++) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            list.add(new int[]{start, end});
        }
        if (!list.isEmpty()) {
            int[][] res = new int[list.size()][2];
            for (int i = 0; i < res.length; i++) {
                res[i] = list.get(i);
            }
            return res;
        }
        //情况四：newIntervals范围覆盖intervals
        if (newInterval[0] <= intervals[0][0] && newInterval[1] >= intervals[intervals.length - 1][1]) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        //情况五：newIntervals的起始位置和结束位置在intervals区间内和区间外的情况组合 共四种
        for (int i = 0; i < intervals.length; i++) {
            //确定起始位置
            if (intervals[i][0] <= newInterval[0] && newInterval[0] <= intervals[i][1]) {
                start = intervals[i][0];
                sf = true;
            }
            if ((i > 0 && newInterval[0] > intervals[i - 1][1] && newInterval[0] < intervals[i][0])
                    || newInterval[0] < intervals[0][0]) {
                start = newInterval[0];
                sf = true;
            }
            if (intervals[i][0] <= newInterval[1] && newInterval[1] <= intervals[i][1]) {
                end = intervals[i][1];
                ef = true;
            }
            if ((i < intervals.length - 1 && newInterval[1] > intervals[i][1] && newInterval[1] < intervals[i + 1][0])
                    || newInterval[1] > intervals[intervals.length - 1][1]) {
                end = newInterval[1];
                ef = true;
            }
            if (sf && ef) {
                list.add(new int[]{start, end});
                ef = false;
                sf = false;
            }
            if (intervals[i][0] > end || intervals[i][1] < start) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
