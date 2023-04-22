package LeetCode.LeetCode;

import java.util.List;

public class MS08_06 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanota(A.size(), A, B, C);
    }

    public void hanota(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            removeTo(A, C);
            return;
        }
        hanota(n - 1, A, C, B);
        removeTo(A, C);
        hanota(n - 1, B, A, C);
    }

    public void removeTo(List<Integer> l1, List<Integer> l2) {
        l2.add(l1.remove(l1.size() - 1));
    }

}
