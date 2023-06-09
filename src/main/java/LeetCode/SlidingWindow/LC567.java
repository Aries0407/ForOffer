package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/10 10:59
 */
public class LC567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        char[] pattern = s1.toCharArray();
        char[] text = s2.toCharArray();
        int pLen = s1.length();
        int tLen = s2.length();
        for (int i = 0; i < pLen; i++) {
            pFreq[pattern[i] - 'a']++;
        }
        int pCount = 0;
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] > 0) {
                pCount++;
            }
        }

        int left = 0;
        int right = 0;
        int winCount = 0;
        while (right < tLen) {
            if (pFreq[text[right] - 'a'] > 0) {
                winFreq[text[right] - 'a']++;
                if (winFreq[text[right] - 'a'] == pFreq[text[right] - 'a']) {
                    winCount++;
                }
            }
            right++;
            while (pCount == winCount) {
                if (right - left == pLen) {
                    return true;
                }
                if (pFreq[text[left] - 'a'] > 0) {
                    winFreq[text[left] - 'a']--;
                    if (winFreq[text[left] - 'a'] < pFreq[text[left] - 'a']) {
                        winCount--;
                    }
                }
                left++;
            }
        }
        return false;
    }
}
