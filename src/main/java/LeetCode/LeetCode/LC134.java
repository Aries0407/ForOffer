package LeetCode.LeetCode;

/**
 * @author Aries
 * @date 2022/11/6 18:26
 */
public class LC134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int count = gas.length;
        for (int i = 0; i < gas.length; i++) {
            int cur = 0;
            int flag = -1;
            for (int j = 0; j < count; j++) {
                cur += gas[(i + j) % count] - cost[(i + j) % count];
                if (cur < 0) {
                    flag = j;
                    break;
                }
            }
            if (flag >= 0) {
                i += flag;
                i--;
            }
            if (cur >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LC134 lc134 = new LC134();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 1, 2};
        System.out.println(lc134.canCompleteCircuit(a, b));
    }
}
