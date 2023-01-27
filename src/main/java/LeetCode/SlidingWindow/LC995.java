package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/18 9:48
 */
public class LC995 {

    //贪心算法
    public int minKBitFlips(int[] A, int K) {
        if (A == null || A.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                if (i + K > A.length) return -1;
                for (int j = i; j < K + i ; j++) {
                    A[j] ^= 1;   //异或运算显著提高计算速度
                    //A[j] = A[j] == 0 ? 1 : 0;
                }
                count++;
            }
        }
        return count;
    }

}
