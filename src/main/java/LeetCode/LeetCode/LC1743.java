package LeetCode.LeetCode;

import java.util.HashSet;

/**
 * @author Aries
 * @date 2021/7/25 18:36
 */
public class LC1743 {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < adjacentPairs.length; i++) {
            set.add(adjacentPairs[i][0]);
            set.add(adjacentPairs[i][1]);
        }
        return new int[2];
    }

    public static void main(String[] args) {

    }
}
