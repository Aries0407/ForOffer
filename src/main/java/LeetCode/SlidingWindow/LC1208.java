package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/14 17:44
 */
public class LC1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        if (maxCost == 0) return 1;
        int[] count = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            count[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int ret = 0;
        while (right < count.length) {
            sum += count[right];
            while (sum > maxCost) {
                sum -= count[left];
                left++;
            }
            ret = Math.max(ret, right - left + 1);
            right++;
        }
        return ret;
    }
}
