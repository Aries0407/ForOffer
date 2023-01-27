package LeetCode.WeeklyCompetition;

/**
 * @author Aries
 * @date 2021/2/21 11:25
 */
public class WC5686 {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] ret = new int[len];
        char[] c = boxes.toCharArray();
        int count = 0;
        for (int i = 0; i < len; i++) {
            ret[i] = helper(c, i);
        }
        return ret;
    }

    private int helper(char[] c, int index) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                count += Math.abs(index - i);
            }
        }
        return count;
    }
}
