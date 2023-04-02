package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ57 {
    /*
    输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
    序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     */

    public int[][] findContinuousSequence(int target) {
        int i = 1;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        while (i < target) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = i; j <= target / 2 + 1; j++) {
                sum += j;
                list.add(j);
                if (sum == target) {
                    lists.add(list);
                    break;
                }
                if (sum > target) {
                    break;
                }
            }
            i++;
        }
        int[][] res = new int[lists.size()][];
        for (int j = 0; j < lists.size(); j++) {
            res[j] = lists.get(j).stream().mapToInt(Integer::intValue).toArray();
        }
        return res;
    }


    //滑动窗口解法
    public int[][] findContinuousSequence2(int target) {
        int left = 1;
        int right = 1;
        int sum = 0;
        ArrayList<LinkedList<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        while (right <= target / 2 + 1) {
            if (sum < target) {
                sum += right;
                list.addLast(right);
                right++;
            }
            if (sum > target) {
                sum -= left;
                list.removeFirst();
                left++;
            }
            if (sum == target) {
                lists.add(new LinkedList<>(list));
                sum -= left;
                left++;
                list.removeFirst();
            }
        }

        int[][] res = new int[lists.size()][];
        for (int i = 0; i < res.length; i++) {
            int[] ret = new int[lists.get(i).size()];
            for (int j = 0; j < lists.get(i).size(); j++) {
                ret[j] = lists.get(i).get(j);
            }
            res[i] = ret;
        }

        return res;
    }


    public static void main(String[] args) {
        JZ57 jz57 = new JZ57();
        jz57.findContinuousSequence2(15);
    }
}
