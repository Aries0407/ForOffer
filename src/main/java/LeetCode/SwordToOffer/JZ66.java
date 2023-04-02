package LeetCode.SwordToOffer;

public class JZ66 {

    public static void main(String[] args) {

    }

    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        for (int i = 1; i < b.length; i++) {
            b[i] = a[i - 1] * b[i - 1];
        }
        int temp = 1;
        for (int i = a.length - 2; i >= 0; i--) {

            temp *= a[i + 1];
            b[i] *= temp;
        }
        return b;
    }
}
