package LeetCode;

import java.util.HashMap;

public class T1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        int ret = 0;
        int[] num = new int[100];
        for (int[] dom : dominoes) {
            int val = dom[0] > dom[1] ? dom[1] * 10 + dom[0] : dom[0] * 10 + dom[1];
            ret += num[val];
            num[val]++;

        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
