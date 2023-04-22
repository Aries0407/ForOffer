package LeetCode.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class T888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ret = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int dela = (sumA - sumB) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int x : A) {
            set.add(x);
        }
        for (int y : B) {
            int x = y + dela;
            if (set.contains(x)) {
                ret[0] = x;
                ret[1] = y;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
