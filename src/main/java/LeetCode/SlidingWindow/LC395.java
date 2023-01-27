package LeetCode.SlidingWindow;

import LeetCode.LC3;

/**
 * @author Aries
 * @date 2021/2/27 9:14
 */
public class LC395 {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        int maxLen = 0;
        for (int i = 1; i <= 26; i++) {
            maxLen = slidingWindow(i, chars, maxLen, k);
        }
        return maxLen;
    }

    public int slidingWindow(int i, char[] chars, int maxLen, int k) {
        int left = 0, right = 0;
        int[] count = new int[26];
        int winCount = 0, ok = 0;
        int n = chars.length;
        while (right < n) {
            count[chars[right] - 'a']++;
            if (count[chars[right] - 'a'] == 1) {
                winCount++;
            }
            if (count[chars[right] - 'a'] == k) {  //不能 ">=" 否则会重复计数
                ok++;
            }

            while (winCount > i) {
                count[chars[left] - 'a']--;
                if (count[chars[left] - 'a'] == k - 1) {
                    ok--;
                }
                if (count[chars[left] - 'a'] == 0) {
                    winCount--;
                }
                left++;
            }
            if (winCount == ok) {
                maxLen = Math.max(right - left + 1, maxLen);
            }
            right++;
        }
        return maxLen;
    }


    public static void main(String[] args) {
        LC395 lc395 = new LC395();
        System.out.println(lc395.longestSubstring("ababac", 3));
    }
}
