package LeetCode.LeetCode;

public class LC1423 {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length - k;
        int sum = 0;
        int window = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            if (i < len) {
                window += cardPoints[i];
            }
            sum += cardPoints[i];
        }
        int cur = window;
        for (int i = len; i < cardPoints.length; i++) {
            cur = cur - cardPoints[i - len] + cardPoints[i];
            window = Math.min(cur, window);
        }
        return sum - window;
    }
}
