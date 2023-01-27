package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class T989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int w = 0;
        List<Integer> list = new LinkedList<>();
        int len = 0;
        int temp = K;
        while (temp != 0) {
            temp /= 10;
            len++;
        }
        int[] num = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            num[i] = K % 10;
            K /= 10;
        }

        int i = num.length - 1, j = A.length - 1;
        while (i >= 0 && j >= 0) {
            w += (num[i] + A[j]);
            list.add(0, w % 10);
            w /= 10;
            i--;
            j--;
        }
        while (i >= 0) {
            list.add(0, (w + num[i]) % 10);
            w = (w + num[i]) / 10;
            i--;
        }
        while (j >= 0) {
            list.add(0, (w + A[j]) % 10);
            w = (w + A[j]) / 10;
            j--;
        }
        if (w != 0) list.add(0, w);
        return list;
    }
}
