package LeetCode.SlidingWindow;

import java.util.*;

/**
 * @author Aries
 * @date 2021/2/9 18:53
 */
public class LC992 {

    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }

    private int atMostKDistinct(int[] a, int i) {
        int left = 0;
        int right = 0;
        int len = a.length;
        int[] freq = new int[len + 1];
        int count = 0;
        int res = 0;
        while (right < len) {
            if (freq[a[right]] == 0) {
                count++;
            }
            freq[a[right]]++;
            right++;
            while (count > i) {
                freq[a[left]]--;
                if (freq[a[left]] == 0) {
                    count--;
                }
                left++;
            }
            res = right - left;
        }
      return res;
    }

    public static void main(String[] args) {

    }

}
