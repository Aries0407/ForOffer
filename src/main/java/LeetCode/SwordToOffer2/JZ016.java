package LeetCode.SwordToOffer2;

/**
 * @author Aries
 * @date 2021/8/22 18:04
 */
public class JZ016 {

    public int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int[] count = new int[128];
        int maxLen = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        while (right < cs.length) {
            int index = cs[right];
            if (count[index] == 0) {
                count[index]++;
            } else if (count[index] >= 1) {
                maxLen = Math.max(maxLen, right - left);
                while (left < right && cs[left] != cs[right]) {
                    count[cs[left++]]--;
                }
                left++;
            }
            right++;
        }
        return Math.max(maxLen, right - left);
    }

    public static void main(String[] args) {

    }
}
