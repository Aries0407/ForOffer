package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/19 8:46
 */
public class LC1004 {

    public int longestOnes(int[] A, int K) {
        int leftSum = 0;
        int rightSum = 0;
        int ret = 0;
        int left = 0;
        for (int right = 0; right < A.length; right++) {
            rightSum += A[right];
            while (rightSum - leftSum > K) {
                leftSum += A[left];
                left++;
            }
            ret = Math.max(ret, right - left + 1);
        }
        return ret;
    }
}
