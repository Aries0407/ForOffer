package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/23 15:54
 */
public class LC1052 {
    /**
     * 先把确定满意的顾客加起来。然后滑动窗口计算可以额外增加的最大满意顾客数。
     *
     * @param customers
     * @param grumpy
     * @param X
     * @return
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int ret = 0;
        int left = 0;
        int right = 0;
        int extra = 0;
        for (int i = 0; i < customers.length; i++) {
            ret += (1 - grumpy[i]) * customers[i];
        }
        for (int i = 0; i < X; i++) {
            extra += grumpy[i] + customers[i];
        }
        right = X;
        int temp = extra;
        while (right < customers.length) {
            temp -= customers[left] * grumpy[left];
            temp += customers[right] * grumpy[right];
            extra = Math.max(temp, extra);
            right++;
            left++;
        }
        return ret + extra;
    }
}
