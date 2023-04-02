package LeetCode.SwordToOffer;

public class JZ14_1 {
    public static void main(String[] args) {

    }

    public int cuttingRope(int n) {
        if (n <= 1) return n - 1;
        int a = n / 3;
        int b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        return (int) Math.pow(3, a) * 2;
    }
}
