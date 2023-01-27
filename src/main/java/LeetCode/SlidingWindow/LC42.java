package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/23 18:20
 */
public class LC42 {
    //暴力
    public int trap1(int[] height) {
        int left = 0;
        int right = 0;
        int ret = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            ret += Math.min(right, left) * (right - left);
        }
        return ret;
    }
}
