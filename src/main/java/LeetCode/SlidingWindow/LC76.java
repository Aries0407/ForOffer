package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/14 18:55
 */
public class LC76 {

    public String minWindow(String s, String t) {
        String ret = "";
        int[] pFreq = new int[123];
        int[] winFreq = new int[123];

        char[] pattern = s.toCharArray();
        char[] text = t.toCharArray();
        int pLen = s.length();
        int tLen = t.length();
        for (int i = 0; i < pLen; i++) {
            pFreq[pattern[i]]++;
        }
        int pCount = 0;
        for (int i = 0; i < 123; i++) {
            if (pFreq[i] > 0) {
                pCount++;
            }
        }

        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int winCount = 0;
        while (right < tLen) {
            if (pFreq[text[right]] > 0) {
                winFreq[text[right]]++;
                if (winFreq[text[right]] == pFreq[text[right]]) {
                    winCount++;
                }
            }
            right++;
            while (pCount == winCount) {
                if (right - left == pLen) {
                    if (minLen > right - left) {
                        minLen = right - left;
                        ret = s.substring(left, right);
                    }
                }
                if (pFreq[text[left]] > 0) {
                    winFreq[text[left]]--;
                    if (winFreq[text[left]] < pFreq[text[left]]) {
                        winCount--;
                    }
                }
                left++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        LC76 lc76 = new LC76();
        System.out.println(lc76.minWindow("bba", "ab"));
    }
}
